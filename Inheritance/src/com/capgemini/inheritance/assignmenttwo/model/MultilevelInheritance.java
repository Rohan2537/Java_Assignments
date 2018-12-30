
/*	1) Create a multi-level inheritance , instantiate the child class and observe constructor invocation.Also show, if needed how 
  	   will u invoke parent class constructor from child class ?
  */

package com.capgemini.inheritance.assignmenttwo.model;

class One
{
	public One()		//constructor of class One;
	{
		System.out.println("Constructor-One");
	}
}

class Two extends One
{
	public Two() 		//constructor of class Two ;
	{
		System.out.println("Contructor-Two");
	}
}

class Three extends Two
{
	public Three() 		// constructor of class Three;
	{
		System.out.println("Constructor-Three");
	}
}


public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Two objectOne = new Two();		//invokes class Two and parent constructor;
		Three objectTwo = new Three();	//invokes class Three and parent constructor;
		
	}
}
