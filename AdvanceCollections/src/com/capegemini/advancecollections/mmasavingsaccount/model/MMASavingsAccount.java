/*	4)	Create two classes Employee_information and MMASaving_Account 
	a.	Employee_information class will have fields empID, Employee_name, employee_designation , Employee_salary, employee_comm with that they will have setter getter methods 
	b.	MMASaving Account class will have fields accountID, accountholder_name, account_balance, isSalaryAccount with that they will have setter and getter methods
	c.	Employee_information object and MMASaving_Account object belongs to a same entity assuming there are more than 5 entities how will you store the objects preserving the relation between them. 
*/

package com.capgemini.advancecollections.mmasavingsaccount.model;

/**
 * class consists of MMASavingsAccount details of users having getter and setters along with overriden toString(),hashCode() and equals() method;
 */
public class MMASavingsAccount {

	private int accountId;
	private String accountHolderName;
	private double accountBalance;
	private boolean isSalaryAccount;
	
	/**
	 * parameterized constructor of class MMASavingsAccount;
	 */
	public MMASavingsAccount(int accountId, String accountHolderName, double accountBalance, boolean isSalaryAccount) {
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.isSalaryAccount = isSalaryAccount;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	/**
	 * method to display values of parameters;
	 */
	@Override
	public String toString() {
		return "MMASavingsAccount [accountId=" + accountId + ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + ", isSalaryAccount=" + isSalaryAccount + "]";
	}

	/**
	 * method to check the hashcode;
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accountBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((accountHolderName == null) ? 0 : accountHolderName.hashCode());
		result = prime * result + accountId;
		result = prime * result + (isSalaryAccount ? 1231 : 1237);
		return result;
	}

	/**
	 * method to compare and store hashCode;
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MMASavingsAccount other = (MMASavingsAccount) obj;
		if (Double.doubleToLongBits(accountBalance) != Double.doubleToLongBits(other.accountBalance))
			return false;
		if (accountHolderName == null) {
			if (other.accountHolderName != null)
				return false;
		} else if (!accountHolderName.equals(other.accountHolderName))
			return false;
		if (accountId != other.accountId)
			return false;
		if (isSalaryAccount != other.isSalaryAccount)
			return false;
		return true;
	}

}
