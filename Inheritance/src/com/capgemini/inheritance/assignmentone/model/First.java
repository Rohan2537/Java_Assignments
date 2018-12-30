/*	1)	Define 2 classes �First� and �Second� with member variables , member functions and constructors of  your choice. Now define a class �Two� in which define main function . In main function create various instances of First and Second  and call their individual member functions.*/

package com.capgemini.inheritance.assignmentone.model;

public class First {

	private String firstName;			
	private String lastName;
	private int age;
	
	public First()		//constructor for class First;
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() 	//getter for firstName;
	{
		return firstName;
	}

	public void setFirstName(String firstName)		//setter for firstName;
	{
		this.firstName = firstName;
	}

	public String getLastName()		//getter for lastName; 
	{
		return lastName;
	}

	public void setLastName(String lastName)		//setter for lastName;
	{
		this.lastName = lastName;
	}

	public int getAge()		//getter for id; 
	{
		return age;
	}

	public void setAge(int age)	//setter for id;
	{
		this.age = age;
	}

	@Override
	public String toString()	//overriden toString() method ;
	{
		return "Person Details [firstName=" + firstName + ", lastName=" + lastName
				+ ", age=" + age + "]";
	}

}
