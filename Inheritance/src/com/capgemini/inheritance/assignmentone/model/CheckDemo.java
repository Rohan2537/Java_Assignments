package com.capgemini.inheritance.assignmentone.model;

public class CheckDemo {

	public static void main(String[] args) 
	{
		Check check = new Check();
		System.out.println(check.variableTwo);		//public;
		System.out.println(check.variableThree);	//protected;
		System.out.println(check.variableFour);		//default;
		check.setVariableOne(100);			//requires setter method to call private instance variables;
		System.out.println(check.getVariableOne());

	}
}
