package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
	
	private final Person person;
	private final Tag tag;
	private String operation;
	
	public Tagging(Person person, Tag tag, String operation) {
		this.person = person;
		this.tag = tag;
		this.operation = operation;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(operation)
			.append(" ")
			.append(person.toString())
			.append(" ")
			.append(tag.toString());
		return sb.toString();
	}
}
