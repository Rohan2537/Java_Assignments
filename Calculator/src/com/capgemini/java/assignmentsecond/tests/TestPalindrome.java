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
	Explanation: Reads 01 from right to left. Therefore it is not a palindrome. */

package com.capgemini.java.assignmentsecond.tests;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestPalindrome {

	@Test
	public void PalindromeTestInteger() {
		PalindromeInteger  palindromeInteger = new PalindromeInteger();
		assertEquals("Palindrome of a number is : " , true, palindromeInteger.Palindrome(121));
	
		assertEquals("Palindrome of a number is : " , false, palindromeInteger.Palindrome(-121));
		
		assertEquals("Palindrome of a number is : " , false, palindromeInteger.Palindrome(10));
	}

}
