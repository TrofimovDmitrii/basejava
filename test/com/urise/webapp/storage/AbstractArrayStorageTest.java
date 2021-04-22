package com.urise.webapp.storage;

import com.urise.webapp.exception.ExistStorageException;
import com.urise.webapp.exception.NotExistStorageException;
import com.urise.webapp.exception.StorageException;
import com.urise.webapp.model.Resume;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public abstract class AbstractArrayStorageTest {
	private final Storage storage;

	private static final String UUID_1 = "uuid1";
	private static final String UUID_2 = "uuid2";
	private static final String UUID_3 = "uuid3";
	private static final String UUID_4 = "uuid4";

	public static final Resume RESUME_1 = new Resume(UUID_1);
	public static final Resume RESUME_2 = new Resume(UUID_2);
	public static final Resume RESUME_3 = new Resume(UUID_3);
	public static final Resume RESUME_4 = new Resume(UUID_4);

	protected AbstractArrayStorageTest(Storage storage) {
		this.storage = storage;
	}

	@Before
	public void setUp() {
		storage.clear();
		storage.save(RESUME_1);
		storage.save(RESUME_2);
		storage.save(RESUME_3);
	}

	@Test
	public void clear() {
		storage.clear();
		Assert.assertEquals(0, storage.size());
	}

	@Test
	public void update() {
		Resume resume = new Resume(UUID_3);
		storage.update(resume);
		assertTrue(resume == storage.get(UUID_3));
	}

	@Test
	public void save() {
		storage.save(RESUME_4);
		Assert.assertEquals(4, storage.size());
	}

	@Test()
	public void get() {
		storage.get(UUID_1);
		Assert.assertEquals(new Resume("uuid1"), storage.get(UUID_1));
	}

	@Test
	public void delete() {
		storage.delete(UUID_1);
		Assert.assertEquals(2, storage.size());
	}

	@Test
	public void getAll() {
		storage.getAll();
		Assert.assertEquals(3, storage.size());
	}

	@Test
	public void size() {
		Assert.assertEquals(3, storage.size());
	}

	@Test(expected = NotExistStorageException.class)
	public void updateNotExist() {
		storage.get("dummy");
	}

	@Test(expected = StorageException.class)
	public void saveOverflow() throws Exception {
		try {
			for (int i = 4; i <= AbstractArrayStorage.STORAGE_LIMIT; i++) {
				storage.save(new Resume());
			}
		} catch (StorageException e) {
			Assert.fail();
		}
		storage.save(RESUME_4);
	}

	@Test(expected = ExistStorageException.class)
	public void saveExist() {
		storage.get(UUID_1);
		storage.save(new Resume(UUID_1));
	}

	@Test(expected = NotExistStorageException.class)
	public void getNotExist() {
		storage.get("dummy");
	}

	@Test(expected = NotExistStorageException.class)
	public void deleteNotExist() {
		storage.delete(UUID_1);
		Assert.assertEquals(2, storage.size());
		storage.get(UUID_1);
	}
}