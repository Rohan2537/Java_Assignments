/*	Consider a Rectangle Shape.Identify its properties and behaviours and implement the same.
	Write a Test Cases to check if the behaviours(methods) are implemented properly.If their 
	are 2 Rectangle objects of different sizes than we should be able to check if they are having same area or not.
	Test the Program with different combinations test cases possible.  
 */

package com.capgemini.classesandobjects.objectmanipulation.model;

public class Rectangle {

	private double length;
	private double breadth;
	public double getLength() 		//getter for length;
	{
		return length;
	}
	public void setLength(double length)	//setter for length;
	{
		this.length = length;
	}
	public double getBreadth() 		//getter for breadth;
	{
		return breadth;
	}
	public void setBreadth(double breadth) 	//setter for breadth;
	{
		this.breadth = breadth;
	}
	
	 public double getAreaOfRectangle()		//method to get area of rectangle;
	 {
		 System.out.println("Length = " +length);
		 System.out.println("Breadth = " +breadth);
		 System.out.println("Area = " +((length*breadth)));
		 return length*breadth;
	 }
	 
	 public double getPerimeterOfRectangle(){		//method to get perimeter of rectangle;
		 System.out.println("Perimeter = " +(2*(length+breadth)));
		 return 2*(length + breadth) ;
	 }
	 
	 public boolean checkAreaOfRectangles(double areaOne, double areaTwo)	// method to compare areas of two rectangle objects;
	 {
		if(areaOne== areaTwo )
		return true;
		return false;
		 
	 }
	 	 
}
