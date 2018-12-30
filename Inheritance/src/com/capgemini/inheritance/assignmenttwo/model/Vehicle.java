
/*	2) create a class "Vehicle", define a method "public void start()" in it. From this class derive a class FourWheeler. 
 	   Override "start()" method of parent class and test it.
*/

package com.capgemini.inheritance.assignmenttwo.model;

public class Vehicle
{
	
	public void start()
	{
		System.out.println("Engine Started");
	}
}

class FourWheeler extends Vehicle{

	@Override
	public void start() 
	{
		super.start();
	
	}
	
}
