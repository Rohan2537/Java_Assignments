/*	7)	Define a parent and a child class . Now explain function overriding with Example. */

package com.capgemini.inheritance.assignmentone.model;

class Parent 
{
	
	void display() 
	{
		System.out.println("Parent Class");
	}
}

class Child extends Parent {

	@Override
	void display()		//overriden method from Parent class;
	{
		System.out.println("Child Class");
	}
}

public class FunctionOverriding {

	public static void main(String[] args) {

		Parent parent = new Child();	//Object type-Child,reference type-Parent;
		parent.display();

		Parent parentOne = new Parent();	//Object type-Parent,reference type-Parent;
		parentOne.display();
	}

}
