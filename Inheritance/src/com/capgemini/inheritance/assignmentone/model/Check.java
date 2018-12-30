/*	3)	Define a class “Check” in which declare member variables using  different accessibility modifiers i.e.  <default>, private ,public and protected.   Define a function “disp” which should be public.  Define a class “CheckDemo” in which you will write “main()” function. Create an instance of  the class “Check” and  
 * 		show how many  variables can be accessed directly and how many indirectly.	*/

package com.capgemini.inheritance.assignmentone.model;

public class Check {
 
	//declaration of instance vaiables of differeent types;
	
	private int variableOne = 10;	
	public int variableTwo = 20;	
	protected int variableThree = 30;	
	int variableFour;	

	
	
	public int getVariableOne() 	//getter for variableone;
	{
		return variableOne;
	}



	public void setVariableOne(int variableOne)	//setter for variableone; 
	{
		this.variableOne = variableOne;
	}



	public void display()	//method to display variables;
	{
	
	}

}
