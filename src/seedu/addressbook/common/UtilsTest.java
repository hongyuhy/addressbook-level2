package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UtilsTest {

	@Test
	public void isAnyNullTest() {
		String[] listOfString = {"hi","hello","heehee"};
		boolean check = Utils.isAnyNull(listOfString);
		assertEquals(false, check);
	}
	
	@Test
	public void isAnyNullTest2(){
		String[] listOfString = {null};
		boolean result = Utils.isAnyNull(listOfString);
		assertEquals(true, result);
	}
	
	@Test
	public void elementsAreUniqueTest(){
		ArrayList<String> arrayListOf = new ArrayList<String>();
		arrayListOf.add("hi");
		arrayListOf.add("hello");
		boolean result = Utils.elementsAreUnique(arrayListOf);
		assertEquals(true, result);
	}
}
