/*	Write a class called Triangle that can be used to represent a triangle. It should include the following methods that return boolean values indicating if the particular property holds:

	isRight (a right triangle)
	isScalene (no two sides are the same length)
	isIsosceles (exactly two sides are the same length)
	isEquilateral (all three sides are the same length)
	Write a simple tester program that creates a few triangles and asks them about their type.

	NOTE: Write appropriate TestCases.
*/

package com.capgemini.classesandobjects.miscellenious.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriangle {

	@Test
	public void testIsTriangleRightAngle()			// test for right angle triangle;
	{
		Triangle triangle = new Triangle(3, 4, 5);
		
		assertEquals(true,triangle.isRightAngleTriangle(triangle));
	}


	@Test
	public void testIsTriangleScalene()			//test for scalene triangle;
	{
		Triangle triangle = new Triangle(3, 4, 5);
		
		assertEquals(true,triangle.isScaleneTriangle(triangle));
	}
	

	@Test
	public void testIsTriangleIsosceles()			//test for isosceles triangle;
	{
		Triangle triangle = new Triangle(4, 4, 5);
		
		assertEquals(true,triangle.isIsoscelesTriangle(triangle));
	}

	@Test
	public void testIsTriangleEquilateral()		//test for equilateral triangle;
	{
		Triangle triangle = new Triangle(5, 5, 5);
		
		assertEquals(true,triangle.isEquilateralTriangle(triangle));
	}

}
