/*	This problem has several parts:

	1. Write a simple Vehicle class that has fields for (at least) current speed, current direction in degrees, and owner name.
	2. Add a static field to your Vehicle class for the highest Vehicle Identification Number issued, and a non-static field that holds each vehicle's ID number.
	3. Write a main method for your Vehicle class that creates a few vehicles and prints out their field values. Note that you can also write a separate tester program as well.
	4. Add two constructors to Vehicle. A no-arg constructor and one that takes an initial owner's name. Modify the tester program from the previous step and test your design.
	5. Make the fields in your Vehicle class private, and add accessor methods for the fields. Which fields should have methods to change them and which should not?
	6. Add a changeSpeed method that changes the current speed of the vehicle to a passed-in value, and a stop method that sets the speed to zero.
	7. Add two turn methods to Vehicle. One that takes a number of degrees to turn, and one that takes simply either a Vehicle.TURN_LEFT or a Vehicle.TURN_RIGHT constant. Define the two constants accordingly.
	8. Add a static method to Vehicle that returns the highest identification number used so far.
	9. Add a toString method to Vehicle.
	10. Now Test all of the above in a main method that will be in saperate class.
*/

package com.capgemini.classesandobjects.miscellenious.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVehicle {
	private Vehicle vehicleOne;
	private Vehicle vehicle;
	
	@Test
	public void testForDirectionOfVehicle()								//test to check the direction of vehicle;
	{				
		vehicle = new Vehicle("Rohan");
		vehicleOne = new Vehicle();
		vehicleOne.setDirection(90);
		
		assertEquals(90,vehicleOne.getDirection());
	}

	@Test
	public void testForChangeInSpeedOfVehicle() 							//test to check the change in speed of vehicle;
	{				
		vehicleOne = new Vehicle();
		vehicleOne.setCurrentSpeed(100);
		assertEquals(110,vehicleOne.changeSpeed(10));
	}
	
	@Test
	public void testToStopTheVehicle() 									//test to stop the vehicle;
	{				
		vehicleOne = new Vehicle();
		assertEquals(0,vehicleOne.stopCar());
	}
	
	@Test
	public void testToChangeTheDirectionOfVehicle() 						//test to change the direction of the vehicle by degrees;
	{				
		vehicleOne = new Vehicle();
		vehicleOne.setDirection(90);
		assertEquals(110,vehicleOne.turnVehicleByDegrees(20));
	}
	
	@Test
	public void testToChangeTheDirectionOfVehicleByConstantTakeLeft() 				//test to change the direction of the vehicle by constant TURN LEFT=10;
	{				
		vehicleOne = new Vehicle();
		vehicleOne.setDirection(90);
		assertEquals(100,vehicleOne.getTURN_LEFT_OR_RIGHT());
	}
	
	
	@Test
	public void testToChangeToStringForVehicle() 							//test to check toString() method - returns owner's name;
	{				
		vehicleOne = new Vehicle("Rohan");
		vehicleOne.setIdentificationNumber(123456);
		vehicleOne.setHighestidentificationNumber(1234567890);
		assertEquals("Car model- Honda WR-V, Car owner : Rohan, Identification Number: 123456, Highest Identification Number: 1234567890",vehicleOne.toString());
	}
	
	@Test
	public void testToCheckHighestIdentificationNumber() 					//test to check toString() method - returns owner's name;
	{				
		
		Vehicle.setHighestidentificationNumber(123456789);			//sets HighestIdentificationNumber;
		
		assertEquals(123456789,vehicle.getHighestidentificationNumber());		// returns same highestIdentificationNumber for both the objects
		assertEquals(123456789,vehicleOne.getHighestidentificationNumber());	//as method for highestIdentificationNumber is static;
		
	}
	
}
