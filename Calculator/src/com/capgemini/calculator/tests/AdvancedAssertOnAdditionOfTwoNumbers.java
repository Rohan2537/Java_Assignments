package com.capgemini.calculator.tests;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;


public class AdvancedAssertOnAdditionOfTwoNumbers {

	public void AdditionTestOfTwoPositiveNumbers() {
		Calculator addition = new Calculator();
		//assertEquals("Addition of numbers is", 100,addition.AdditonOfTwoNumbers(50, 50));
		assertThat(addition.AdditonOfTwoNumbers(50, 50),is(100));
		assertThat(addition.AdditonOfTwoNumbers(50, 50), allOf(is(100), instanceOf(Integer.class)));
	}

	@Test
	public void AdditionTestOfOnePositiveNumberAndZero() {
		Calculator addition = new Calculator();
		//assertEquals("Addition of numbers is", 50,	addition.AdditonOfTwoNumbers(50, 0));
		assertThat(addition.AdditonOfTwoNumbers(50, 0),is(50));
		assertThat(addition.AdditonOfTwoNumbers(50, 0), allOf(is(50), instanceOf(Integer.class)));
		}
	@Test
	public void AdditionTestOfOneNegativeNumberAndZero() {
		Calculator addition = new Calculator();
		//assertEquals("Addition of numbers is", -50,	addition.AdditonOfTwoNumbers(-50, 0));
		assertThat(addition.AdditonOfTwoNumbers(-50, 0), allOf(is(-50), instanceOf(Integer.class)));
		}
	
	@Test
	public void AdditionTestOfOnePositiveNumberAndNegativeNumber() {
		Calculator addition = new Calculator();
		//assertEquals("Addition of numbers is", 0,	addition.AdditonOfTwoNumbers(-50, 50));
		assertThat(addition.AdditonOfTwoNumbers(-50, 50), allOf(is(0), instanceOf(Integer.class)));
		}
	
	@Test
	public void AdditionTestOfTwoZeros() {
		Calculator addition = new Calculator();
		//assertEquals("Addition of numbers is", 0,	addition.AdditonOfTwoNumbers(0, 0));
		assertThat(addition.AdditonOfTwoNumbers(0, 0), allOf(is(0), instanceOf(Integer.class)));
		}
	
	@Test
	public void AdditionTestOfTwoNegativeNumbers() {
		Calculator addition = new Calculator();
		//assertEquals("Addition of numbers is", -100,	addition.AdditonOfTwoNumbers(-50, -50));
		assertThat(addition.AdditonOfTwoNumbers(-50, -50), allOf(is(-100), instanceOf(Integer.class)));
		}
}
