package com.capgemini.calculator.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestAdditionOfTwoNumbers.class ,
	TestSubtractionOfTwoNumbers.class,
	TestMultiplicationOfTwoNumbers.class,
	TestDivisionOfTwoNumbers.class})

public class CalculatorTestSuite {
	
}
