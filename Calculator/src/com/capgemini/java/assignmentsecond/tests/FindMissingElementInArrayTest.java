/*	Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

	Example 1:

	Input: [3,0,1]
	Output: 2
	Example 2:

	Input: [9,6,4,2,3,5,7,0,1]
	Output: 8*/

package com.capgemini.java.assignmentsecond.tests;

import static org.junit.Assert.*;

import org.junit.Test;


public class FindMissingElementInArrayTest {

	@Test
	public void showMissingElement() {
		int numbers[] = {1,3,4,6,5,7};
		FindMissingElementInArray findMissingElementInArray = new FindMissingElementInArray();
		assertEquals(2,findMissingElementInArray.missingElement(numbers));
	}

	@Test
	public void searchMissingElement() {
		int numbers[] = {1,3,4,6,5,7,2,9};
		FindMissingElementInArray findMissingElementInArray = new FindMissingElementInArray();
		assertEquals(8,findMissingElementInArray.missingElement(numbers));
	}
}
