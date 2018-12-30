/*	Write a program to input a word from the user and remove the duplicate characters present in it.
	Example:
	INPUT � abcabcabc
	OUTPUT � abc
	INPUT � javaforschool
	OUTPUT � javforschl
	INPUT � Mississippi
	OUTPUT � Misp 	*/
package com.capgemini.java.assignmentsecond.tests;

import static org.junit.Assert.*;
import org.junit.Test;


public class RemoveDuplicateCharacterTest {

	@Test
	public void RemovingDuplicatesCheck() {
		RemoveDuplicateCharacter removeDuplicate = new RemoveDuplicateCharacter();
		assertEquals("abc",removeDuplicate.removeDuplicateCharacter("aaabc") );
	}

}
