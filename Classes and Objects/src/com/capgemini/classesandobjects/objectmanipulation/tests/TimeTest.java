/*	
 	Write the definition for a class called Time that has hours and minutes as integer. The class has the following behaviours/services/methods:
	void setTime(int, int) to set the specified value in object
	void showTime() to display time object
	time sum(time) to sum two time object & return time
	1. Write the definitions for each of the above member functions.
	2. Write main function to create three time objects. Set the value in two objects and call sum() to calculate sum and assign it in third object. Display all time objects.
 */

package com.capgemini.classesandobjects.objectmanipulation.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TimeTest {
	private Time TimeFirst;
	private Time TimeSecond;
	private Time TimeThird;

	@Before
	public void setUp() {
		TimeFirst = new Time();
		TimeSecond = new Time();
		TimeThird = new Time();
	}

	@Test
	public void testHoursWithValidInputs() {	//test for hours with possible valid inputs i.e hours<24;
		TimeFirst.set(5, 4);
		TimeSecond.set(5, 2);
		TimeThird.addTime(TimeFirst, TimeSecond);
		assertEquals(10, TimeThird.getHours(), 0);
	}

	@Test
	public void testMinutesWithValidInputs() {		//test for minutes with possible valid inputs i.e minutes<60;
		TimeFirst.set(10, 5);
		TimeSecond.set(10, 5);
		TimeThird.addTime(TimeFirst, TimeSecond);
		assertEquals(10, TimeThird.getMinutes(), 0);
	}

	@Test
	public void testHoursWithInvalidInputs() {		//test for hours with possible invalid inputs i.e hours>24;
		TimeFirst.set(20, -4);
		TimeSecond.set(54, -2);
		TimeThird.addTime(TimeFirst, TimeSecond);
		assertEquals(-1, TimeThird.getHours(), 0);
	}

	@Test
	public void testMinutesWithInvalidInputs() {	//test for minutes with possible invalid inputs i.e minutes>60;
		TimeFirst.set(2, 30);
		TimeSecond.set(4, 40);
		TimeThird.addTime(TimeFirst, TimeSecond);
		assertEquals(-1, TimeThird.getMinutes(), 0);
	}

}
