/* 9)	Define a class �Shape� with �draw()� function . Now derive  classes like �Circle�, �Polygon�,�Rectangle� etc. from �Shape� and override �draw()� function. Define a class �ShapeDemo� in which  write  main()  function. In the main function create a reference to Shape class referring to any of the sub class. 
 * 		Using this reference, call �draw()� and check the result. */


package com.capgemini.inheritance.assignmentone.model;
public class Shape {

	public void draw()	//method draw for class Shape;
	{
	
	}
		
}
class Cirle extends Shape
{
	public void draw()		//method draw for class Circle;
	{
		System.out.println("Shape: Circle");
	}
		
}

class Polygon extends Shape
{
	public void draw()		//method draw for class Polygon;
	{
		System.out.println("Shape: Polygon");
	}
}

class Rectangle extends Shape	//method draw for class Rectangle;
{
	public void draw()
	{
		System.out.println("Shape: Rectangle");
	}
}

class Square extends Shape
{
	public void draw()		//method draw for class Square;
	{
		System.out.println("Shape: Square");
	}
}