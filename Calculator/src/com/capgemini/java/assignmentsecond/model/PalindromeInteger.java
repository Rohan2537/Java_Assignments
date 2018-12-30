/*Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

	Example 1:
	Input: 121
	Output: true

	Example 2:
	Input: -121
	Output: false
	Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

	Example 3:
	Input: 10
	Output: false
	Explanation: Reads 01 from right to left. Therefore it is not a palindrome.*/

package com.capgemini.java.assignmentsecond.model;

public class PalindromeInteger {

	public static boolean Palindrome(int numberToCheck) {
		int number = numberToCheck;
		int reversedNumber = 0;
		int remainder = 0;
		while (numberToCheck > 0) {
			remainder = numberToCheck % 10;
			numberToCheck = numberToCheck / 10;
			reversedNumber = reversedNumber * 10 + remainder;
		}
		if (number == reversedNumber) {
			return true;
		} else
			return false;

	}

}
