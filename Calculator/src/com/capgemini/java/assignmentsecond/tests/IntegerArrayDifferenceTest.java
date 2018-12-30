/*	Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the 
	array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.*/

package com.capgemini.java.assignmentsecond.tests;

import static org.junit.Assert.*;
import org.junit.Test;

public class IntegerArrayDifferenceTest {

	
	IntegerArrayDifference integerArrayDifference = new IntegerArrayDifference();
	
	@Test
	public void trueDifferenceBetweenArrays() {
		int[] numbers={5,9,4,5,8,1,2,3};
		assertEquals(true,integerArrayDifference.findAbsoluteDifference(numbers, 3) );
	}

	@Test
	public void falseDifferenceBetweenArrays() {
		int[] numbers={5,9,4,5,8,1,2,3};
		assertEquals(false,integerArrayDifference.findAbsoluteDifference(numbers, 1) );
	}
}