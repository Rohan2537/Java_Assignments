/*	4)	Create two classes Employee_information and MMASaving_Account 
	a.	Employee_information class will have fields empID, Employee_name, employee_designation , Employee_salary, employee_comm with that they will have setter getter methods 
	b.	MMASaving Account class will have fields accountID, accountholder_name, account_balance, isSalaryAccount with that they will have setter and getter methods
	c.	Employee_information object and MMASaving_Account object belongs to a same entity assuming there are more than 5 entities how will you store the objects preserving the relation between them. 
*/

package com.cg.advancecollections.mmasavingsaccount;

/**
 * class consists of Employee information having getters and setters along with overridden toString(),hashCode()and equals() method;
 */
public class EmployeeInformation {
	private int id;
	private String employeeName;
	private String employeeDesignation;
	private double employeeSalary;
	private int employeeNumber;
	
	/**
	 * Parameterized constructor of class EmployeeInformation;
	 */
	public EmployeeInformation(int id, String employeeName, String employeeDesignation, double employeeSalary, int employeeNumber) {
		this.id = id;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
		this.employeeNumber = employeeNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	/**
	 * method to display values of parameters;
	 */
	@Override
	public String toString() {
		return "EmployeeInformation [id=" + id + ", employeeName=" + employeeName + ", employeeDesignation="
				+ employeeDesignation + ", employeeSalary=" + employeeSalary + ", employeeNumber=" + employeeNumber
				+ "]";
	}

	/**
	 * method to check the hashCode;
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeDesignation == null) ? 0 : employeeDesignation.hashCode());
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + employeeNumber;
		long temp;
		temp = Double.doubleToLongBits(employeeSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		return result;
	}

	/**
	 * method to compare the hashcode and store it;
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeInformation other = (EmployeeInformation) obj;
		if (employeeDesignation == null) {
			if (other.employeeDesignation != null)
				return false;
		} else if (!employeeDesignation.equals(other.employeeDesignation))
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (employeeNumber != other.employeeNumber)
			return false;
		if (Double.doubleToLongBits(employeeSalary) != Double.doubleToLongBits(other.employeeSalary))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	
}
