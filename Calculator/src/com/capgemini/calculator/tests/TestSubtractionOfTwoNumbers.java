package com.capgemini.calculator.tests;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TestSubtractionOfTwoNumbers {
	
	private Calculator subtraction;
	
	@Before
	public void SetUp(){
		subtraction = new Calculator();
	}
	
	@Test
	public void SubtractionTestOfTwoPositiveNumbers() {
		assertEquals("Subtraction of numbers is", 0 ,subtraction.SubtractionOfTwoNumbers(50, 50));
	}

	public void SubtractionTestOfOnePositiveNumberAndZero() {
		assertEquals("Subtraction of numbers is", 50 ,subtraction.SubtractionOfTwoNumbers(0, 50));
		}
	
	public void SubtractionTestOfOneNegativeNumberAndZero() {
		assertEquals("Subtraction of numbers is", 50 ,subtraction.SubtractionOfTwoNumbers(-50, 0));
		}
	
	public void SubtractionTestOfOnePositiveNumberAndNegativeNumber() {
		assertEquals("Subtraction of numbers is", -100 ,subtraction.SubtractionOfTwoNumbers(50, -50));
		}
	
	public void SubtractionTestOfTwoZeros() {
		assertEquals("Subtraction of numbers is", 0 ,subtraction.SubtractionOfTwoNumbers(0, 0));
		}
	
	public void SubtractionTestOfTwoNegativeNumbers() {
		assertEquals("Subtraction of numbers is", 0 ,subtraction.SubtractionOfTwoNumbers(-50, -50));
		}
	
}


