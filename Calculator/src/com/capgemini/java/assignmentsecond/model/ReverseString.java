/*Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

	Example 1:
	Input: "Let's take LeetCode contest"
	Output: "s'teL ekat edoCteeL tsetnoc"*/

package com.capgemini.java.assignmentsecond.model;

public class ReverseString {

	public String ReverseOfAString(String inputString) {
	
		String reverseOfAString = "";
		String reverseString="";
		
		for (int inputValue = inputString.length() - 1; inputValue >= 0; inputValue--) {
			reverseOfAString = reverseOfAString + inputString.charAt(inputValue);
		}
		
		String stringArray[] = reverseOfAString.split(" ");
		
		for(int counter= stringArray.length-1; counter>=0; counter--){
		reverseString +=stringArray[counter];	
		
		if(counter !=0)
			reverseString = reverseString +" ";
		}
		
		return reverseString;

	}
}
	
	