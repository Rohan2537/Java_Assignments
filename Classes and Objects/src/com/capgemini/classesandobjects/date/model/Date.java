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

package com.capgemini.classesandobjects.date.model;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) 	//constructor for  Date;
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String toString() 						// method to get the value of a Date object printed
	{
		return this.day + "/" + this.month + "/" + this.year;
	}

	public boolean isSmaller(Date dateToCompare) 		// method to check whether a date is smaller than the other
	{
		if (this.year < dateToCompare.year)
			return true;

		if (this.year == dateToCompare.year) 
		{
			if (this.month < dateToCompare.month)
				return true;
			if (this.month == dateToCompare.month) 
			{
				if (this.day < dateToCompare.day)
					return true;
			}
			return false;							// If the value of invoking Date object is smaller than the given object, true is returned otherwise false is returned.
		}
		return false;

	}

	public int[] difference(Date differenceOfDays) 	// method to find out the difference of days, months and years in two dates.
	{
		int[] differerenceInDays = { (differenceOfDays.day - this.day),
									(differenceOfDays.month - this.month),
									(differenceOfDays.year - this.year),
								   };
		
		System.out.println(differenceOfDays.year - this.year);
		System.out.println(differenceOfDays.month - this.month);
		System.out.println(differenceOfDays.day - this.day);
		
		return differerenceInDays;		//returns array of difference in days;
		
	}

}
