package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {

	public String value;
	private boolean isPrivate;
	private String messageConstraints;
	private static String validationRegex;

	public Contact(String value, boolean isPrivate, String messageConstraints, String validationRegex)
			throws IllegalValueException {
		
		this.isPrivate = isPrivate;
		this.messageConstraints = messageConstraints;
		Contact.validationRegex = validationRegex;
		value = value.trim();
		if (!isValidInformation(value)) {
			throw new IllegalValueException(messageConstraints);
		}
		this.value = value;
	}

	/**
	 * Checks if a given string is a valid person email.
	 */
	public static boolean isValidInformation(String test) {
		return test.matches(validationRegex);
	}

	@Override
	public String toString() {
		return value;
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	public boolean isPrivate() {
		return isPrivate;
	}
}
