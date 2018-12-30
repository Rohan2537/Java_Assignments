/* 	Write the definition for a class called Distance that has properties feet as integer  and inches as float. The class has the following behaviours/services/methods:
	void set(int, float) to give value to object
	void disp() to display distance in feet and inches
	Distance add(Distance) to sum two distances & return distance
	1. Write the definitions for each of the above member functions.
	2. Write DistanceTest class with main function to create three Distance objects. Set the value in two objects and call add() to calculate sum and assign it in third object. Display all distances.*/

package com.capgemini.classesandobjects.objectmanipulation.model;

public class Distance {
	private int feet;
    private float inches;
    float remainder;
	
	public void set(int feet,float inches)			//method to set feet and inches;
	{
		this.feet = feet;
		this.inches = inches;
	}
	
	public int getFeet()				//getter for feet;
	{
		return this.feet;
	}
	
	public float getInches()		//getter for inches;
	{
		return this.inches;
	}
	
	public void display()		//method to display distance;
	{
		System.out.println(" Distance is : "+ this.feet+"'"+" + "+ this.inches+"''");
	}
	
	public Distance addDistance(Distance distanceOne,Distance distanceTwo )			//method to add two Distance class objects;
	{
		this.feet = distanceOne.feet + distanceTwo.feet;
		this.inches = distanceOne.inches + distanceTwo.inches;
		remainder = this.inches %12;	// if inches > 12 adds remainder to feet;
		if( remainder == 0)
		{
			System.out.println("Total distance is: "+ this.feet+"'"+" + "+ this.inches+"''" );
		}
		else System.out.println("Total distance is: "+ (this.feet+remainder)+"'" + "0''" );
		return this;				//returns object;
	}
}
