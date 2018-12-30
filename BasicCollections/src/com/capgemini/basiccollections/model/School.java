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
 * 	Class School which defines the properties of School along with getter ,setter and overridden toString(),equals() and hashCode() method;
 */
public class School {

	private String name;
	private String city;
	private String schoolDistrict;
	private int  schoolRanking;
	
	
	/**
	 * parameterized constructor of class  School;
	 * @param name
	 * @param city
	 * @param schoolDistrict
	 * @param schoolRanking
	 */
	public School(String name,String city, String schoolDistrict,int  schoolRanking) {
		this.name = name;
		this.city = city;
		this.schoolDistrict = schoolDistrict;
		this.schoolRanking = schoolRanking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSchoolDistrict() {
		return schoolDistrict;
	}

	public void setSchoolDistrict(String schoolDistrict) {
		this.schoolDistrict = schoolDistrict;
	}

	public int getSchoolRanking() {
		return schoolRanking;
	}

	public void setSchoolRanking(int schoolRanking) {
		this.schoolRanking = schoolRanking;
	}
	
	/**
	 * Overridden method to display values of parameter;
	 */
	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", schoolDistrict=" + schoolDistrict + ", schoolRanking="
				+ schoolRanking + "]";
	}
	
	/**
	 * Overridden method to check the hashCode;
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((schoolDistrict == null) ? 0 : schoolDistrict.hashCode());
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
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (schoolDistrict == null) {
			if (other.schoolDistrict != null)
				return false;
		} else if (!schoolDistrict.equals(other.schoolDistrict))
			return false;
		return true;
	}
	
}

