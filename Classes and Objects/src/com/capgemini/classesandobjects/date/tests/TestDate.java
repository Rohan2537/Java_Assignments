/*	Complete the implementation of the given Date class and test it by writing TestCases using JUnit:-

class Date { 
	private int d, m, y; // data members to store the day, month and year of a date.
	public Date(int d, int m, int y) //constructor to initialize Date objects
	{
		//initialize d, m, y of the current object using the d, m, y parameters. 
	}
	public String toString()// method to get the value of a Date object printed
	{
		//return the value of a Date object as a String in d/m/y format.
	}
	public boolean isSmaller(Date d)// method to check whether a date is smaller than the other 
	{
		//If the value of invoking Date object is smaller than the given object, true is returned otherwise false is returned.
	}
	public int[] diff(Date d) //method to find out the difference of days, months and years in two dates.
	{
		//The difference of days, months and years in the invoking and parameter Date objects 
		//is obtained and returned in an int array. The first element of the array should represent
		//difference of days; second one, the difference of months and the third one, the difference of years.
	}
}
 */

package com.capgemini.classesandobjects.date.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestDate {
private Date dateOne;
private Date dateTwo;
	@Before
	public void setUp()
	{
		dateOne = new Date(5, 2, 2000);
		dateTwo = new Date(8, 3, 1990);
		
	}
	@Test
	public void testDateIsSmallerTrue()		//test to check true condition for smaller date;
	{
		assertEquals(true,dateTwo.isSmaller(dateOne));
	}

	@Test
	public void testDateIsSmallerFalse() 		//test to check false condition for smaller date;
	{
		assertEquals(false,dateOne.isSmaller(dateTwo));
	}
	@Test
	public void testDateToStringCheck() 		//test to check toString() method - prints date/month/year;
	{
		assertEquals("8/3/1990",dateTwo.toString());
	}

}
