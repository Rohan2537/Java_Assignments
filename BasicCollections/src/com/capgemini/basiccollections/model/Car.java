/*	Create classes for the below objects with the fields specified below.
	Create three different instances for each type and add them to a collection.
	Now, read from these collection and print each attribute in console.

	Laptop : company, model, operatingSystem, processor
	Car : make, model, year, price
	Television : company, type (LCD, LED, Plasma), 3D enabled, price
	CellPhone : company, model, description, operatingSstem, price
	School : name, city, school district, greatSchoolRanking


	Observe that Set doesn�t accept duplicate objects by writing an ddisplaying the elements in collection.
	For each above object, override equals() and hashCode() methods and define the equality. Please see the criteria below. Create few equal objects (based on the below criteria) and add them to HashSet and observe the fact that Set doesn�t accept duplicates (through equals() and hashCode()).


	Company and model  together define the equality for Laptop. If two laptops have same company and model then they are equal.
	Car : make and model together define equality
	Television : company, type (LCD, LED, Plasma) and price together define equality
	CellPhone : company, model and operatingSstem together define equality
	School : name, city and school district together define equality*/

package com.capgemini.basiccollections.model;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * @author Rohan Bhosale
 * Class Car which defines the properties of the car alomg with overriden toString(),hashcode() and equals() method;
 */
public class Car {

	private String company;
	private String model;
	private int year;
	private double price;
	
	/**
	 * Parameterized constructor of class Car;
	 * @param company
	 * @param model
	 * @param year
	 * @param price
	 */
	public Car( String company,String model, int year, double price) {

		this.company = company;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Overridden method to display values of parameter;
	 */
	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	/**
	 * Overridden method to check the hashCode;
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	/**
	 * Overridden method to compare the hashCode and store value;;
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
}

