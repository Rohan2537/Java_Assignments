package com.capgemini.calculator.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(RunCalculatorCategory.class)
@SuiteClasses({TestAdditionOfTwoNumbers.class ,
	TestSubtractionOfTwoNumbers.class,
	TestMultiplicationOfTwoNumbers.class,
	TestDivisionOfTwoNumbers.class})

public class CalculatorTestCategories {

}
