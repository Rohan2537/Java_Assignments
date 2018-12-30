package com.capgemini.calculator.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.*;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedCalculatorTests {
	
	private static Calculator calculator = new Calculator();
	
	private int expected;
	private int inputOne;
	private int inputTwo;
	
	@Parameters
	public static List<Object[]>data(){
		return Arrays.asList(new Object[][]{
				{0,10,10},
				{-5,5,0},
				{0,0,0},
				{10,10,20},
				{-10,-10,-20},
		});
		
	}

	public ParameterizedCalculatorTests(int inputOne ,int inputTwo, int expected){
		this.inputOne = inputOne;
		this.inputTwo = inputTwo;
		this.expected =	expected;
	}
	
	@Test
	public void test(){
		assertEquals(expected, calculator.AdditonOfTwoNumbers(inputOne, inputTwo));
	}
	
}
	

