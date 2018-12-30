/*	Consider a Rectangle Shape.Identify its properties and behaviours and implement the same.
	Write a Test Cases to check if the behaviours(methods) are implemented properly.If their 
	are 2 Rectangle objects of different sizes than we should be able to check if they are having same area or not.
	Test the Program with different combinations test cases possible.  
 */


package com.capgemini.classesandobjects.objectmanipulation.tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class TestRectangle {
	private Rectangle rectangle;
	private Rectangle rectangleOne;
	private Rectangle rectangleTwo;
	
	@Before
	public void setUp(){
		rectangle = new Rectangle();
		
		rectangleOne = new Rectangle();			// object of Rectangle class;
		rectangleOne.setLength(5);
		rectangleOne.setBreadth(5);
		
		rectangleTwo = new Rectangle();			// object of Rectangle class;
		rectangleTwo.setLength(10);
		rectangleTwo.setBreadth(10);
		
	}
	@Test
	public void testForRectangleOneBehaviors(){							//checks Behaviors of rectangleOne;
		assertThat(25.0,is(rectangleOne.getAreaOfRectangle()));
		assertThat(20.0,is(rectangleOne.getPerimeterOfRectangle()));
	}
	
	@Test
	public void testForRectangleTwoBehaviors(){							//checks Behaviors of rectangleTwo;
		assertThat(100.0,is(rectangleTwo.getAreaOfRectangle()));
		assertThat(40.0,is(rectangleTwo.getPerimeterOfRectangle()));
	}
	
	@Test
	public void testForAreaRectangleCheck(){							//checks area of both the rectangles;
		
		assertThat(false,is(rectangle.checkAreaOfRectangles(rectangleOne.getAreaOfRectangle(),
					rectangleTwo.getAreaOfRectangle())));
	}
}
