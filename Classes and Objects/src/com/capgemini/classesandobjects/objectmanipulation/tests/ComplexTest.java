/* 	Write the definition for a class called Complex that has floating point properties for storing real and imaginary parts. The class has the following behaviours/services/methods:
	void set(float, float) to set the specified value in object
	void disp() to display complex number object
	complex sum() to sum two complex numbers & return complex number
	1. Write the definitions for each of the above member functions.
	2. Write a ComplexTest class with main function to create three complex number objects. Set the value in two objects and call sum() to calculate sum and assign it in third object. Display all complex numbers.
*/

package com.capgemini.classesandobjects.objectmanipulation.tests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ComplexTest {
		private  Complex complexNumberOne;
		private Complex complexNumberTwo;
		private Complex complexNumberThree;
	@Before
	public void setUp()
	{
		 complexNumberOne = new Complex();			//objects of class Complex;
		 complexNumberTwo = new Complex();
		 complexNumberThree = new Complex();	
	}
	
	@Test
	public void testComplexNumbersRealPartWithPositiveInputs() 	//test for complex numbers with both real part positive;
	{
		 complexNumberOne.set(2, 4);
		 complexNumberTwo.set(4, 2);
		 complexNumberThree.sum(complexNumberOne, complexNumberTwo);
		 assertEquals(6,complexNumberThree.getReal(),0);
	}

	@Test
	public void testComplexNumbersRealPartWithNegativeInputs() 		//test for complex numbers with both real part negative;
	{
		 complexNumberOne.set(-2,-4);
		 complexNumberTwo.set(-4, -2);
		 complexNumberThree.sum(complexNumberOne, complexNumberTwo);
		 assertEquals(-6,complexNumberThree.getReal(),0);
	}
	
	@Test
	public void testComplexNumbersImaginaryPartWithPositiveInputs() 	//test for complex numbers with both imaginary part positive;
	{
		 complexNumberOne.set(2, 4);
		 complexNumberTwo.set(4, 2);
		 complexNumberThree.sum(complexNumberOne, complexNumberTwo);
		 assertEquals(6,complexNumberThree.getImaginary(),0);
	}

	@Test
	
	public void testComplexNumbersImaginaryPartWithNegativeInputs() 	//test for complex numbers with both imaginary part negative;
	{
		 complexNumberOne.set(-2,-4);
		 complexNumberTwo.set(-4, -2);
		 complexNumberThree.sum(complexNumberOne, complexNumberTwo);
		 assertEquals(-6,complexNumberThree.getImaginary(),0);
	}

}
