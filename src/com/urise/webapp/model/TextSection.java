package com.urise.webapp.model;

public class TextSection extends AbstractSection {
	private final String textContent;

	public TextSection(String textContent) {
		this.textContent = textContent;
	}

	public String getTextContent() {
		return textContent;
	}

	@Override
	public String toString() {
		return textContent;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		TextSection that = (TextSection) o;

		return textContent.equals(that.textContent);
	}

	@Override
	public int hashCode() {
		return textContent.hashCode();
	}
}
