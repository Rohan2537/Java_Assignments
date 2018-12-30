/*Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

	Example 1:
	Input: "Let's take LeetCode contest"
	Output: "s'teL ekat edoCteeL tsetnoc"*/

package com.capgemini.java.assignmentsecond.tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestReverseString {

	private ReverseString reverseString;
	@Before
	public void Setup(){
		reverseString = new ReverseString();
	}
	
	@Test
	public void ReverseOfAStringTestUsingNumbers() {
		assertEquals("Reverse Of a String is : " ,"123" ,reverseString.ReverseOfAString("321"));
	}
	
	@Test
	public void ReverseOfAStringTestUsingSentence() {
		assertEquals("Reverse Of a String is : " ,"s'teL ekat edoCteeL tsetnoc" ,reverseString.ReverseOfAString("Let's take LeetCode contest"));
	}
	
	@Test
	public void ReverseOfAStringTestUsingWords() {
		assertEquals("Reverse Of a String is : " ,"olleH dlroW" ,reverseString.ReverseOfAString("Hello World"));
	}
}
