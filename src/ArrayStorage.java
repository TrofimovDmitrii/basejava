import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size;

    void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    void save(Resume resume) {
        int index = getIndex(resume.getUuid());
        if (index < 0) {
            if (size < storage.length) {
                storage[size] = resume;
                size++;
            } else {
                System.out.println("Хранилище переполнено.");
            }
        } else {
            System.out.println("Резюме с таким uuid " + resume.getUuid() + " уже существует.");
        }
    }

    Resume get(String uuid) {
        int index = getIndex(uuid);
        if (index < 0) {
            return null;
        }
        return storage[index];
    }

    void delete(String uuid) {
        int index = getIndex(uuid);
        if(index >= 0) {
            if (size - index - 1 >= 0) {
                System.arraycopy(storage, index + 1, storage, index, size - index - 1);
                size--;
            }
        } else {
            System.out.println("Резюме с таким uuid не найден.");
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        return Arrays.copyOfRange(storage, 0, size);
    }

    int size() {
        return size;
    }

    int getIndex(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                return i;
            }
        }
        return -1;
    }
}