package com.capgemini.calculator.tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class TestDivisionOfTwoNumbers {
private Calculator division;
	
	@Before
	public void SetUp(){
		division = new Calculator();
	}
	
	@Test
	public void DivisionTestOfTwoPositiveNumbers(){
		assertEquals("Division of numbers is", 1 ,division.DivisionOfTwoNumbers(50, 50));
	}

	public void DivisionTestOfOnePositiveNumberAndZero() {
		assertEquals("Division of numbers is", 0 ,division.DivisionOfTwoNumbers(0, 50));
		}
	
	public void DivisionTestOfOneNegativeNumberAndZero() {
		assertEquals("Division of numbers is", 0 ,division.DivisionOfTwoNumbers(-50, 0));
		}
	
	public void DivisionTestOfOnePositiveNumberAndNegativeNumber()  {
		assertEquals("Division of numbers is", -1 ,division.DivisionOfTwoNumbers(50, -50));
		}
	
	public void DivisionTestOfTwoZeros() {
		assertEquals("Division of numbers is", 0 ,division.DivisionOfTwoNumbers(0, 0));
		}
	
	public void DivisionTestOfTwoNegativeNumbers() {
		assertEquals("Division of numbers is", 1 ,division.DivisionOfTwoNumbers(-50, -50));
		}

}