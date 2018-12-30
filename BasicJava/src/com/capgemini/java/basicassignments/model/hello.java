package com.capgemini.java.basicassignments.model;

class HelloWorld
{
 
	public static void main(String[] args)
	{
		System.out.println("Hello World !!!");
		addition(20,10);
		subtraction(10,20);
		multiplication(20,10);
		division(20,10);
	}
	
	static int addition(int numberOne, int numberTwo)
	{
		
		System.out.println("Addition is: " +(numberOne+numberTwo));
		return (numberOne+numberTwo);
	}

	static int subtraction(int numberOne, int numberTwo)
	{
		
		System.out.println("Subtraction is: " +(numberTwo-numberOne));
		return (numberTwo-numberOne);
	}
	
	static int multiplication(int numberOne, int numberTwo)
	{
		
		System.out.println("Multiplication is: " +(numberOne*numberTwo));
		return (numberOne*numberTwo);
	}
	
	static int division(int numberOne, int numberTwo)
	{
		
		System.out.println("Division is: " +(numberOne/numberTwo));
		return (numberOne/numberTwo);
	}
}