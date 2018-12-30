/*	10)	Modify �ShapeDemo� class created in above assignment #9 to create an array of Shape class. In this array store instances of the sub classes. Traverse through the array and  call �draw()� and
 * 		 check the result.*/

package com.capgemini.inheritance.assignmentone.model;

public class ShapeArrayTraverse {
	
	public static void main(String[] args)
	{
		Shape shapeOne = new Cirle(); 					// object type-Cirle,reference type-Shape;
		Shape shapeTwo = new Polygon(); 				// object type-Polygon,reference type-Shape;
		Shape shapeThree = new Rectangle(); 			// object type-Rectangle,reference type-Shape;
		Shape shapeFour = new Square(); 				// object type-Square,reference type-Shape;
		Shape arrayOfShapes[] = { shapeOne, shapeTwo, shapeThree, shapeFour };
		
		for (int counter = 0; counter < arrayOfShapes.length; counter++) 
		{
		arrayOfShapes[counter].draw();
		}
	
	}
}