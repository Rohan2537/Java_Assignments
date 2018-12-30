/* 	Write the definition for a class called Distance that has properties feet as integer  and inches as float. The class has the following behaviours/services/methods:
	void set(int, float) to give value to object
	void disp() to display distance in feet and inches
	Distance add(Distance) to sum two distances & return distance
	1. Write the definitions for each of the above member functions.
	2. Write DistanceTest class with main function to create three Distance objects. Set the value in two objects and call add() to calculate sum and assign it in third object. Display all distances.*/


package com.capgemini.classesandobjects.objectmanipulation.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DistanceTest {
	private Distance distanceFirst;				
	private Distance distanceSecond;
	private Distance distanceThird;

	@Before
	public void setUp() {
		distanceFirst = new Distance();			//objects of class Distance;
		distanceSecond = new Distance();
		distanceThird = new Distance();
	}

	@Test
	public void testFeetWithPositiveInputs() {		//test for feet with both positive inputs;
		distanceFirst.set(2, 4);
		distanceSecond.set(4, 2);
		distanceThird.addDistance(distanceFirst, distanceSecond);
		assertEquals(6, distanceThird.getFeet(), 0);
	}

	@Test
	public void testInchesWithPositiveInputs() {		//test for inches with both positive inputs;
		distanceFirst.set(2, 5);
		distanceSecond.set(4, 5);
		distanceThird.addDistance(distanceFirst, distanceSecond);
		assertEquals(10, distanceThird.getInches(), 0);
	}

	@Test
	public void testFeetWithNegativeInputs() {		//test for feet with both negative inputs;
		distanceFirst.set(-2, -4);
		distanceSecond.set(-4, -2);
		distanceThird.addDistance(distanceFirst, distanceSecond);
		assertEquals(-6, distanceThird.getFeet(), 0);
	}

	@Test
	public void testInchesWithNegativeInputs() {	//test for inches with both negative inputs;
		distanceFirst.set(2, -5);
		distanceSecond.set(4, -5);
		distanceThird.addDistance(distanceFirst, distanceSecond);
		assertEquals(-10, distanceThird.getInches(), 0);
	}

}
