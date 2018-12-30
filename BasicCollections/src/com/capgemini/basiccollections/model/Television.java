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
 * 	Class Television which defines the features of Television along with getter ,setter and overridden toString(),equals() and hashCode() method;
 */
public class Television {

	private String company;
	private String type;
	private boolean threeD;
	private double price;
	
	
	/**
	 * Parameterized constructor of class Television; 
	 * @param company
	 * @param type
	 * @param threeD
	 * @param price
	 */
	public Television( String company,String type,boolean threeD,double price) {
		this.company = company;
		this.type = type;
		this.threeD = threeD;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isThreeD() {
		return threeD;
	}

	public void setThreeD(boolean threeD) {
		this.threeD = threeD;
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
		return "Television [company=" + company + ", type=" + type + ", threeD=" + threeD + ", price=" + price + "]";
	}

	/**
	 * Overridden method to check the hashCode;
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
}
