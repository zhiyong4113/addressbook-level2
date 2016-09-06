package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class PersonTest {
	
	private Name name;
	
	@Before
	public void setup() throws IllegalValueException {
		name = new Name("Test Name");
	}
	
	@Test
	public void testNameIsSimilarFirst() throws IllegalValueException {
		name = new Name("John Doe");
		Name otherName = new Name("john doe");
		boolean similar = name.isSimilar(otherName);
		assertEquals(true, similar);
	}
	
	@Test
	public void testNameIsSimilarSecond() throws IllegalValueException {
		name = new Name("John S Doe");
		Name otherName = new Name("john doe");
		boolean similar = name.isSimilar(otherName);
		assertEquals(true, similar);
	}
	
	@Test
	public void testNameIsSimilarFirstThird() throws IllegalValueException {
		name = new Name("John S Doe");
		Name otherName = new Name("john s");
		boolean similar = name.isSimilar(otherName);
		assertEquals(true, similar);
	}
	
	@Test
	public void testNameIsNotSimilarFirst() throws IllegalValueException {
		name = new Name("John Doe");
		Name otherName = new Name("john");
		boolean similar = name.isSimilar(otherName);
		assertEquals(false, similar);
	}
	
	@Test
	public void testNameIsNotSimilarSecond() throws IllegalValueException {
		name = new Name("John S Doe");
		Name otherName = new Name("doe");
		boolean similar = name.isSimilar(otherName);
		assertEquals(false, similar);
	}
	

}
