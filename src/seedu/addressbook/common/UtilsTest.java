package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UtilsTest {

	@Test
	public void isAnyNullTest() {
		String[] listOfString = {"hi","hello","heehee"};
		boolean result = Utils.isAnyNull(listOfString);
		assertEquals(false, result);
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

	@Test
	public void elementsAreUniqueTest2(){
		ArrayList<String> arrayListOf = new ArrayList<String>();
		arrayListOf.add("hi");
		arrayListOf.add("hi");
		boolean result = Utils.elementsAreUnique(arrayListOf);
		assertEquals(false, result);
	}
}
