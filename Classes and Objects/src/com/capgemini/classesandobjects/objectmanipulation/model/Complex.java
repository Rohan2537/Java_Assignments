/* 	Write the definition for a class called Complex that has floating point properties for storing real and imaginary parts. The class has the following behaviours/services/methods:
	void set(float, float) to set the specified value in object
	void disp() to display complex number object
	complex sum() to sum two complex numbers & return complex number
	1. Write the definitions for each of the above member functions.
	2. Write a ComplexTest class with main function to create three complex number objects. Set the value in two objects and call sum() to calculate sum and assign it in third object. Display all complex numbers.
*/
package com.capgemini.classesandobjects.objectmanipulation.model;

public class Complex {
	
	private float realPart;
	private float imaginaryPart;
	
	public void set(float realPart,float imaginaryPart)		//method to set real and imaginary part;
	{
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	public float getReal()			//getter for realPart;
	{
		return this.realPart;
	}
	
	public float getImaginary()			//getter for imaginaryPart;
	{
		return this.imaginaryPart;
	}
	
	public void display()					//method to display complex number;
	{
		System.out.println("Complex number is: "+ this.realPart+" + "+ this.imaginaryPart +"i");
	}
	
	public Complex sum(Complex numberOne,Complex numberTwo )		//method to add two complex numbers;
	{
		this.realPart = numberOne.realPart + numberTwo.realPart;
		this.imaginaryPart = numberOne.imaginaryPart + numberTwo.imaginaryPart;
		System.out.println("Sum of complex numbers is: "+ this.realPart+" + "+ this.imaginaryPart +"i");
		return this;		//returns object of class Complex;
	}
}
