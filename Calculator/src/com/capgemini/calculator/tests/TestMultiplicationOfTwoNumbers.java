package com.capgemini.calculator.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestMultiplicationOfTwoNumbers {

private Calculator multiplication;
	
	@Before
	public void SetUp(){
		multiplication = new Calculator();
	}
	
	@Test
	public void MultiplicationTestOfTwoPositiveNumbers() {
		assertEquals("Multiplication of numbers is", 2500 ,multiplication.MultiplicationOfTwoNumbers(50, 50));
	}

	public void MultiplicationTestOfOnePositiveNumberAndZero() {
		assertEquals("Multiplication of numbers is", 0 ,multiplication.MultiplicationOfTwoNumbers(0, 50));
		}
	
	public void MultiplicationTestOfOneNegativeNumberAndZero() {
		assertEquals("Multiplication of numbers is", 0 ,multiplication.MultiplicationOfTwoNumbers(-50, 0));
		}
	
	public void MultiplicationTestOfOnePositiveNumberAndNegativeNumber() {
		assertEquals("Multiplication of numbers is", -2500 ,multiplication.MultiplicationOfTwoNumbers(50, -50));
		}
	
	public void MultiplicationTestOfTwoZeros() {
		assertEquals("Multiplication of numbers is", 0 ,multiplication.MultiplicationOfTwoNumbers(0, 0));
		}
	
	public void MultiplicationTestOfTwoNegativeNumbers() {
		assertEquals("Multiplication of numbers is", 2500 ,multiplication.MultiplicationOfTwoNumbers(-50, -50));
		}
	
}