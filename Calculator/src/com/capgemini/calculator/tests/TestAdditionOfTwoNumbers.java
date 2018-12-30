package com.capgemini.calculator.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdditionOfTwoNumbers {

	@Test
	public void AdditionTestOfTwoPositiveNumbers() {
		Calculator addition = new Calculator();
		assertEquals("Addition of numbers is", 100,addition.AdditonOfTwoNumbers(50, 50));
	}

	public void AdditionTestOfOnePositiveNumberAndZero() {
		Calculator addition = new Calculator();
		assertEquals("Addition of numbers is", 50,	addition.AdditonOfTwoNumbers(50, 0));
		}
	
	public void AdditionTestOfOneNegativeNumberAndZero() {
		Calculator addition = new Calculator();
		assertEquals("Addition of numbers is", -50,	addition.AdditonOfTwoNumbers(-50, 0));
		}
	
	public void AdditionTestOfOnePositiveNumberAndNegativeNumber() {
		Calculator addition = new Calculator();
		assertEquals("Addition of numbers is", 0,	addition.AdditonOfTwoNumbers(-50, 50));
		}
	
	public void AdditionTestOfTwoZeros() {
		Calculator addition = new Calculator();
		assertEquals("Addition of numbers is", 0,	addition.AdditonOfTwoNumbers(0, 0));
		}
	
	public void AdditionTestOfTwoNegativeNumbers() {
		Calculator addition = new Calculator();
		assertEquals("Addition of numbers is", -100,	addition.AdditonOfTwoNumbers(-50, -50));
		}
	
}
