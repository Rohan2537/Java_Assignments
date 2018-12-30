/*	8)	Define a parent class with one function. Define child class with the function having same name as of parent class function, but having different argument.
Create an instance of child class and call the functions. Make sure u have followed the concept of �function overloading � in inheritance.
*/

package com.capgemini.inheritance.assignmentone.model;

class BaseClass
{
	public void display(String name)	//function display with one parameter;
	{
	System.out.println("Name:"+name);
	}
}

class DerivedClass extends BaseClass
{
	public void display(String name,int id)		//function display with two parameter;
	{
		System.out.println("Name:"+name+", id: "+id);
	}
}
public class FunctionOverloading {

	public static void main(String[] args) 
	{
		DerivedClass child = new DerivedClass();	//object of Derived class;
		child.display("Shubham");
		child.display("Rohan", 100);
	}
}
