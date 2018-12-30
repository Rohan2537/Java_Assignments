/*	5) Create an employee class with id, name and salary.
	Create a class with main() write a code to persist the object in the file.
	Create another class with main() write code to read the object from the file.
	run the first main(), this should write the object in file succesfullky.
	now run the second main(), this should read the object from the file and display it on the console screen.
	HINT:- Use Serialization and Deserialization*/

package com.capgemini.collections.model;

public class Employee implements Serializable {

	private String name;
	private int id;
	private double salary;
	
	public Employee(String name,int id,double salary) {
	this.name = name;
	this.id = id;
	this.salary = salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Name :" + getName() + ", Id : " + getId()
				+ ", Salary : " + getSalary() + "]";
	}
	
	
}
