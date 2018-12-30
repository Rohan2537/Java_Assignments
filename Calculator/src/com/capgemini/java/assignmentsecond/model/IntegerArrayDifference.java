/*	Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the 
	array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.*/

package com.capgemini.java.assignmentsecond.model;

public class IntegerArrayDifference {

	public boolean findAbsoluteDifference(int[] numbers, int k) {

		/*
		 * int[] numbers={5,9,6,8,7,1,6,3}; k=3;
		 */

		for (int i = 0; i < numbers.length; i++) {

			for (int j = i+1; j < numbers.length; j++) {

				if (j - i <= k) {
					if (numbers[i] == numbers[j]) {
						return true;

					}
				}
			}

		}
		return false;
	}

}