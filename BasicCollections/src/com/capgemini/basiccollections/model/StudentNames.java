/*	Add all the names of our class students randomly to a collection, iterate through them and print. Observe that collection is maintaining the order that you add.
	Add all the names of our class students randomly to a collection, iterate through them and print. Observe that collection keeps these elements in a natural order.
*/
package com.capgemini.basiccollections.model;

/**
 * 
 * @author Rohan Bhosale
 * class StudentNames consists of parameter for names of student having getter and setter along with overridden toString(),equals() and hashCode() method;
 */
public class StudentNames {
	private String names;
	
	/**
	 * Parameterized constructor of class StudentNames;
	 * @param names
	 */
	public StudentNames(String names) {
		this.names = names;
	}
	
	/**
	 * Overridden method to display values of parameter;
	 */
	@Override
	public String toString() {
		return "Student [Name :" + names + "]";
	}

	/**
	 * Overridden method to check the hashCode;
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((names == null) ? 0 : names.hashCode());
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
		StudentNames other = (StudentNames) obj;
		if (names == null) {
			if (other.names != null)
				return false;
		} else if (!names.equals(other.names))
			return false;
		return true;
	}
	
}
