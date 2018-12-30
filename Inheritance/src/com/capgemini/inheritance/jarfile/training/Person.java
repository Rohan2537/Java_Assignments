/*	2)	Create a  class called �Person� inside the package �com.training� . compile it and store it in jar file. Now using this jar file, access the package �com.training� and the class �Person� from other Application stored at 
 * 		completely different location.*/

package com.capgemini.inheritance.jarfile.training;

/**
 * 
 * @author	Rohan Bhosale;
 *class Person consists of two private instance varibles name and id along with toString method to return values of parameters;
 */
public class Person {

	private String name;
	private int id;
	 
	/**
	 * constructor of class Person to initialize the parameters;
	 * @param name
	 * @param id
	 */
	public Person(String name,int id) {
		this.name = name;
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

/**
 * Overridden method which returns the values of the parameters;
 */
	@Override
	public String toString() {
		return "Person [Name : " + name + ", id : " + id + "]";
	}
	
	
}
