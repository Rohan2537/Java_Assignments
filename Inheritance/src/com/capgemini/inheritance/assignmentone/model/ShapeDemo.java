package com.capgemini.inheritance.assignmentone.model;

public class ShapeDemo {
	
	public static void main(String[] args)
	{
		Shape shapeOne = new Cirle();	//object type-Cirle,reference type-Shape;
		shapeOne.draw();
		Shape shapeTwo = new Polygon();	//object type-Polygon,reference type-Shape;
		shapeTwo.draw();
		Shape shapeThree = new Rectangle();		//object type-Rectangle,reference type-Shape;
		shapeThree.draw();
		Shape shapeFour = new Square();		//object type-Square,reference type-Shape;
		shapeFour.draw();
	}
}
