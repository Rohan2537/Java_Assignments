/*	Write a class called Triangle that can be used to represent a triangle. It should include the following methods that return boolean values indicating if the particular property holds:

	isRight (a right triangle)
	isScalene (no two sides are the same length)
	isIsosceles (exactly two sides are the same length)
	isEquilateral (all three sides are the same length)
	Write a simple tester program that creates a few triangles and asks them about their type.

	NOTE: Write appropriate TestCases.
*/

package com.capgemini.classesandobjects.miscellenious.model;

public class Triangle {

	public static void main(String[] args) {
		Triangle t= new Triangle(4, 4, 2);
		t.isIsoscelesTriangle(t);
		System.out.println(t.isIsoscelesTriangle(t));
		
		
	}
		private int sideOne;
		private int sideTwo;
		private int sideThree;
			
		public Triangle(int sideOne,int sideTwo,int sideThree)			//constructor for class Triangle;
		{
			this.sideOne=sideOne;
			this.sideTwo=sideTwo;
			this.sideThree=sideThree;
		}
		
		public int getSideOne() 										//getter for sideOne;
		{
			return sideOne;
		}

		public void setSideOne(int sideOne) 							//setter for sideOne;
		{
			this.sideOne = sideOne;
		}

		public int getSideTwo()											//getter for sideTwo;
		{
			return sideTwo;
		}

		public void setSideTwo(int sideTwo) 							//getter for sideTwo;
		{
			this.sideTwo = sideTwo;
		}

		public int getSideThree()										//getter for sideThree;
		{
			return sideThree;
		}

		public void setSideThree(int sideThree) 						//setter for sideThree;
		{
			this.sideThree = sideThree;
		}
		
		public boolean isRightAngleTriangle(Triangle object)			//method to check right angle triangle; (sideOne*sideOne)+(sideTwo*sideTwo) == (sideThree*sideThree);
		{
			if((object.getSideThree()*object.getSideThree()) == ((object.getSideTwo()*object.getSideTwo())+(object.getSideOne()*object.getSideOne())))
			{
				return true;
			}
			
			return false;	
		}
		
		public boolean isScaleneTriangle(Triangle object) 				//method to check scalene triangle ; no two sides are equal;
		{
			if((object.getSideOne() != (object.getSideTwo()) && 
					(object.getSideOne() != object.getSideThree())) && 
						(object.getSideTwo() != object.getSideThree())
					) 
				
			return true;
			return false;	
		}

		public boolean isIsoscelesTriangle(Triangle object) 			// method to check isosceles triangle; any two sides are equal;
		{
			if( (object.getSideOne() == object.getSideTwo()) && (object.getSideOne() != object.getSideThree())   || 
					(object.getSideOne() == object.getSideThree()) && (object.getSideOne() != (object.getSideTwo())   ||
						(object.getSideTwo() == object.getSideThree()) && (object.getSideTwo() != object.getSideOne())
					 )) 
				
			return true;
			return false;	
		}
		
		public boolean isEquilateralTriangle(Triangle object)			//method to check equilateral triangle; all sides are equal;
		{
			if((object.getSideOne() == (object.getSideTwo()) || 
			       (object.getSideOne() == object.getSideThree())
			       )) 
				
			return true;
			return false;	
		}
		
  }

