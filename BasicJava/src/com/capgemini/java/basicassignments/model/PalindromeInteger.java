package com.java_assignments;
/* Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

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
	Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */

package com.capgemini.java.basicassignments.model;

import java.util.*;

public class PalindromeInteger {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check :");

		int numberToCheck = sc.nextInt();
		Palindrome(numberToCheck);

	}

	public static void Palindrome(int numberToCheck) {
		int number = numberToCheck;
		int reversedNumber = 0;
		int remainder = 0;
		while (numberToCheck > 0) {
			remainder = numberToCheck % 10;
			numberToCheck = numberToCheck / 10;
			reversedNumber = reversedNumber * 10 + remainder;

		}

		if (number == reversedNumber) {
			System.out.println("Entered number is a palindrome.");
		} else
			System.out.println("Entered number is not a palindrome.");

	}

}
