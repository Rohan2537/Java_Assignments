/*	1)	Define 2 classes �First� and �Second� with member variables , member functions and constructors of  your choice. Now define a class �Two� in which define main function . In main function create various instances of First and Second  and call their individual member functions.*/
package com.capgemini.inheritance.assignmentone.model;

public class Second {

	public static void main(String[] args) 
	{
		First firstPerson = new First();	//first object of class First;
		firstPerson.setFirstName("Rohan");
		firstPerson.setLastName("Bhosale");
		firstPerson.setAge(24);
		System.out.println(firstPerson.toString());

		First secondPerson = new First();		//second object of class First;
		secondPerson.setFirstName("Shubham");
		secondPerson.setLastName("Bhatt");
		secondPerson.setAge(23);
		System.out.println(secondPerson.toString());

		First ThirdPerson = new First();		//third object of class First;
		ThirdPerson.setFirstName("Tushar");
		ThirdPerson.setLastName("Deore");
		ThirdPerson.setAge(23);
		System.out.println(ThirdPerson.toString());
	}
}
