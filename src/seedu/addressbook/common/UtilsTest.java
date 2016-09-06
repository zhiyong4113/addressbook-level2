package seedu.addressbook.common;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class UtilsTest {
	
	private Utils utils;
	
	@Before
	public void setup() {
		utils = new Utils();
	}
	@Test
	public void testItemsNullity() {
		boolean valueNullity = Utils.isAnyNull(new Object(), null);
		assertEquals(true, valueNullity);
	}
	
	@Test
	public void testItemsNonNullity() {
		boolean valueNonNullity = Utils.isAnyNull(new Object(), new Object());
		assertEquals(false, valueNonNullity);
	}
	
	@Test
	public void testElementUniqueness() {
		ArrayList<Integer> testItems = new ArrayList<>();
		testItems.add(1);
		testItems.add(2);
		testItems.add(3);
		boolean valueUnique = Utils.elementsAreUnique(testItems); 
		assertEquals(true, valueUnique);
	}
	
	@Test
	public void testElementNonUniqueness() {
		ArrayList<Integer> testItems = new ArrayList<>();
		testItems.add(1);
		testItems.add(2);
		testItems.add(1);
		boolean valueNotUnique = Utils.elementsAreUnique(testItems); 
		assertEquals(false, valueNotUnique);
	}

}
