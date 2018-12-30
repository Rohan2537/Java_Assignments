/*		Write a program to accept an array of names and a name and check whether the name is present in the array. Return the count of occurrence. Use the following array as input
		{�Dave�, �Ann�, �George�, �Sam�, �Ted�, �Gag�, �Saj�, �Agati�, �Mary�, �Sam�, �Ayan�, �Dev�, �Kity�, �Meery�, �Smith�, �Johnson�, �Bill�, �Williams�, �Jones�, �Brown�, �Davis�, �Miller�, �Wilson�, �Moore�, �Taylor, �Anderson�, �Thomas�, �Jackson�}*/

package com.capgemini.java.assignmentsecond.tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class SearchNamesArrayTest {
	
	private SearchNamesArray searchNamesArray;
	@Before
	public void SetUp(){
		searchNamesArray = new SearchNamesArray();
	}
	
	@Test
	public void SearchNamePresentInArray() {
		assertEquals(3, searchNamesArray.SearchNameInArray("Dave"));
	}


	@Test
	public void SearchNameNotPresentInArray() {
		assertEquals(0, searchNamesArray.SearchNameInArray("Annie"));
	}
}

