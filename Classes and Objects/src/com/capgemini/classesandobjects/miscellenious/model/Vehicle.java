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

package com.capgemini.classesandobjects.miscellenious.model;

public class Vehicle {

	public static void main(String[] args) 
	{
	Vehicle vehicleOne = new Vehicle();						//objects of class Vehicle;
	vehicleOne.setOwnerName("Rohan");
	vehicleOne.setIdentificationNumber(123456);
	System.out.println(vehicleOne.toString());
	
	Vehicle vehicleTwo = new Vehicle();
	vehicleTwo.setOwnerName("Shubham");
	vehicleTwo.setIdentificationNumber(123455);
	System.out.println(vehicleTwo.toString());
	
	Vehicle vehicleThree = new Vehicle();
	vehicleThree.setOwnerName("Shubham");
	vehicleThree.setIdentificationNumber(123455);
	System.out.println(vehicleThree.toString());
	
}
	private int currentSpeed;
	private int direction;
	private String ownerName = "";
	private static int highestidentificationNumber;
	private int identificationNumber;
	private  final int TURN_LEFT_OR_RIGHT = 10;




	public int getTURN_LEFT_OR_RIGHT() 								//getter for TURN_LEFT_OR_RIGHT;
	{
		return getDirection()+ TURN_LEFT_OR_RIGHT;
	}

	public Vehicle(String ownerName ) 						// parametrized constructor of class Vehicle;
	{
		this.ownerName = ownerName;
	}
	
	public Vehicle() 										// non-parametrized constructor of class Vehicle;
	{
		
	}
	
	public int getCurrentSpeed() 							// getter for current speed;
	{
		if(this.currentSpeed>0)
		return currentSpeed;
		return 0;
	}

	public void setCurrentSpeed(int currentSpeed) 			//setter for current speed;
	{
		this.currentSpeed = currentSpeed;
	}

	public int getDirection() 								//getter for direction;
	{
		if(this.direction>0 && this.direction<360)
		return direction;
		return 0;
	}

	public void setDirection(int direction) 				//setter for direction;
	{
		this.direction = direction;
	}

	public String getOwnerName() 							//getter for owner's name;
	{
		return ownerName;
	}

	public void setOwnerName(String ownerName) 				//setter for owner's name;
	{
		this.ownerName = ownerName;
	}

	public static int getHighestidentificationNumber() 		//getter for highest identification number;
	{
		return highestidentificationNumber;
	}

	public static void setHighestidentificationNumber(int highestidentificationNumber)		//setter for highest identification number; 
	{
		Vehicle.highestidentificationNumber = highestidentificationNumber;
	}

	public int getIdentificationNumber() 					//getter for Identification number;
	{
		if(this.identificationNumber>0)
		return identificationNumber;
		return 0;
	}

	public void setIdentificationNumber(int identificationNumber) 		//setter for identification number;
	{
		
		this.identificationNumber = identificationNumber;
		
	}

	public int changeSpeed(int increaseBy) 								//method to change speed of vehicle;
	{
		return currentSpeed + increaseBy ;
	}
	
	public int stopCar() 												//method to stop the vehicle;
	{
		
	  setCurrentSpeed(0);
	  return 0;
	  
	}
	
	public int turnVehicleByDegrees(int turnByDegrees) 					//method to turn vehicle by certain degrees;
	{
		return getDirection()+turnByDegrees;
	}
	
	public String toString()											//method toString() to display owner;
	{
		return "Car model- Honda WR-V, " + "Car owner : "+ this.ownerName +", Identification Number: " +this.identificationNumber +", Highest Identification Number: " +this.getHighestidentificationNumber();
	}
}


