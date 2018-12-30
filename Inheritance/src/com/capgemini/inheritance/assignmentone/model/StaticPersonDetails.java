/*	2)	Create a class with static and non-static member variables. Define static and non-static member functions. Create instance
  		of this class and call both static and non-static member functions.*/

package com.capgemini.inheritance.assignmentone.model;

public class StaticPersonDetails {

	private String name;
	private static int id = 100;
	private int age;

	public void StaticAndNonStatic()	//constructor of class StaticAndNonStatic;
	{
		this.name=name;
		this.age=age;
		this.id = id;
	}

	public String getName() 	//getter for name;
	{
		return name;
	}

	public void setName(String name)	//setter for name;
	{
		this.name = name;
	}

	public static int getId() 	//getter-static for id; as id is static;
	{
		return id++;
	}

	public int getAge() 	//getter for age;
	{
		return age;
	}

	public void setAge(int age) 	//setter for age;
	{
		this.age = age;
	}


@Override
	public String toString() 		//overriden toString() method;
	{
		return "StaticPersonDetails [name=" + name + ", age=" + age + ",  id=" +id +"]";
	}

public static void main(String[] args) 
{

	StaticPersonDetails personOne = new StaticPersonDetails();	//first object of class StaticPersonDetails;
	personOne.name="Rohan";
	personOne.age=23;
	System.out.println(personOne.toString());
	System.out.println(personOne.getId());
	
	StaticPersonDetails personTwo = new StaticPersonDetails();	//second object of class StaticPersonDetails;
	personTwo.name="Shubham";
	personTwo.age=24;
	System.out.println(personTwo.toString());
	System.out.println(personTwo.getId());
	
	StaticPersonDetails personThree = new StaticPersonDetails();	//third object of class StaticPersonDetails;
	personThree.name="Tushar";
	personThree.age=23;
	System.out.println(personThree.toString());
	System.out.println(personThree.getId());
	
	
}


}
