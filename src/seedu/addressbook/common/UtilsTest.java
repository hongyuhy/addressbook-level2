package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UtilsTest {

	@Test
	public void isAnyNullTest_noNull_returnFalse() {
		String[] listOfString = {"hi","hello","heehee"};
		boolean result = Utils.isAnyNull(listOfString);
		assertEquals(false, result);
	}
	
	@Test
	public void isAnyNullTest_nullInObject_returnTrue(){
		String[] listOfString = {null};
		boolean result = Utils.isAnyNull(listOfString);
		assertEquals(true, result);
	}
	
	@Test
	public void elementsAreUniqueTest_allUnique_returnTrue(){
		ArrayList<String> arrayListOf = new ArrayList<String>();
		arrayListOf.add("hi");
		arrayListOf.add("hello");
		boolean result = Utils.elementsAreUnique(arrayListOf);
		assertEquals(true, result);
	}

	@Test
	public void elementsAreUniqueTest_notUnique_returnFalse(){
		ArrayList<String> arrayListOf = new ArrayList<String>();
		arrayListOf.add("hi");
		arrayListOf.add("hi");
		boolean result = Utils.elementsAreUnique(arrayListOf);
		assertEquals(false, result);
	}
}
