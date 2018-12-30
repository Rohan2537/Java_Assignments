/*	4)	Show the example of single level inheritance with constructor invocation.	*/

package com.capgemini.inheritance.assignmentone.model;

class A
{
	public A()			//constructor of class A;
	{
	System.out.println("A const");
	}
}

class B extends A
{
	public B() 			//constructor of class B;
	{
	System.out.println("B const");
	}
}
public class SingleLevelInheritance
{

	public static void main(String[] args) 
	{
		
		A a = new A();		//Object type- A, Reference type- B;
		B b = new B();		//Object type- B, Reference type- B;
		A c = new B();		//Object type- B, Reference type- A;
		
	}
}
