/*	Write a program to input a word from the user and remove the duplicate characters present in it.
	Example:
	INPUT � abcabcabc
	OUTPUT � abc
	INPUT � javaforschool
	OUTPUT � javforschl
	INPUT � Mississippi
	OUTPUT � Misp 	*/

package com.capgemini.java.assignmentsecond.model;

public class RemoveDuplicateCharacter {

	public String removeDuplicateCharacter(String input) {
		
		String withoutDuplicate = "";
		char stringsCharacterArray[] = input.toCharArray();
		for (int count = 0; count < stringsCharacterArray.length; count++) {
			System.out.println(!(withoutDuplicate.contains(String.valueOf(stringsCharacterArray[count]))));
			if (!(withoutDuplicate.contains(String.valueOf(stringsCharacterArray[count]))))
			{
				withoutDuplicate += stringsCharacterArray[count];
			}
		}
		System.out.println(withoutDuplicate);
		return withoutDuplicate;
	}
}
