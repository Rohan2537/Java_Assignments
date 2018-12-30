/*	5)	Show the example of multi-level inheritance with constructor invocation. */

package com.capgemini.inheritance.assignmentone.model;

class One
{
	public One() 			//constructor of class one;
	{
		System.out.println("Constructor- First");
	}
}

class Two extends One
{
	public Two() 				//constructor of class two;
	{
		System.out.println("Constructor- Second");
	}
}

class Three extends Two
{
	public Three() 				//constructor of class three;
	{
		System.out.println("Constructor- Third");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) 
	{
		One one = new Two();		//object type- Two, reference type-one;
		One two = new Three();		//object type- Three, reference type-two;
}
	
	
}
