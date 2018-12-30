/*	Write a program to find if a particular element is present in a multi-dimensional array.*/

package com.capgemini.java.assignmentsecond.tests;

import static org.junit.Assert.*;
import org.junit.Test;


public class ElementInMultidimensionalArrayTest {

	@Test
	public void ifNumberPresentInMultiDimensionalArray() {
		
		ElementInMultidimensionalArray elementToSearch = new ElementInMultidimensionalArray();
		
		int numbers[][]={
				{1,2,3},
				{4,5,6}
		};
		assertEquals(true,elementToSearch.searchElement(6, numbers));
	}

	@Test
	public void ifNumberNotPresentInMultiDimensionalArray() {
		
		ElementInMultidimensionalArray elementToSearch = new ElementInMultidimensionalArray();
		
		int numbers[][]={
				{1,2,3},
				{4,5,6}
		};
		assertEquals(false,elementToSearch.searchElement(9, numbers));
	}
	
}
