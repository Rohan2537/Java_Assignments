/*	
 	Write the definition for a class called Time that has hours and minutes as integer. The class has the following behaviours/services/methods:
	void setTime(int, int) to set the specified value in object
	void showTime() to display time object
	time sum(time) to sum two time object & return time
	1. Write the definitions for each of the above member functions.
	2. Write main function to create three time objects. Set the value in two objects and call sum() to calculate sum and assign it in third object. Display all time objects.
*/

package com.capgemini.classesandobjects.objectmanipulation.model;

public class Time {
	private int hours;
	private int minutes;
	private int remainderMinutes;
	private int hoursFromMinutes;


	public void set(int hours, int minutes)			// method to set hours and minutes;
	{
		this.hours = hours;
		this.minutes = minutes;
	}

	public int getHours()		//getter for hours;
	{
		if (this.hours <= 23)
		return this.hours;
		return -1;
	}

	public int getMinutes()		//getter for minutes;
	{
		if (this.minutes <= 59)
		return this.minutes;
		return -1;
	}

	public void display() 		//method to display time;
	{
		System.out.println(" Time is : " + this.hours + ":" + this.minutes+ "hrs");
	}

	public Time addTime(Time timeOne, Time timeTwo) 	//method to add two Time objects;
	{
		this.hours = timeOne.hours + timeTwo.hours;
		this.minutes = timeOne.minutes + timeTwo.minutes;
		if (this.hours <= 23 && this.minutes < 60)		//checks if hours<=23 and minutes<60;
		{
			System.out.println("Total Time is: " + this.hours + ":"+ this.minutes + " hrs");
			
		} 
		else if (this.hours > 23 && this.minutes >= 60) 
		{
				this.hours = this.hours - 24;			//subtracts extra hours value from 24;
				remainderMinutes = this.minutes - 60;	//subtracts extra minutes from 60;
				hoursFromMinutes = this.minutes / 60;	//to add extra minutes into hours;

				this.minutes = remainderMinutes;		//sets this.minutes equal to remainderMinutes;
				this.hours = this.hours + hoursFromMinutes;
				System.out.println("Total Time is: " + this.hours + ":"+ this.minutes + " hrs");
				
		}
		else if (this.hours > 23 && this.minutes <60) 
		{
				this.hours = this.hours - 24;
				System.out.println("Total Time is: " + this.hours + ":"+ this.minutes + " hrs");
				
		}
		return this;		//returns object;
	}
}
