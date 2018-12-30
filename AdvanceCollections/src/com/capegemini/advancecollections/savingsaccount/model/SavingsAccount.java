/*	1)	Create a Class SavingAccount with field�s acc_balance, acc_ID, accountHoldername, isSalaryAccount. Also add setter and getter methods with business method like withdraw and deposit.
	a.	Create 5 different object of SavingAccount and add them into ArrayList, now interate the arraylist and display all SavingAccount�s object one by one.
	b.	Now save the ArrayList which contains SavingAccount�s object into a file and read the file and display all savingAccount Object one by one.
	c.	Create class BankAccountList which will maintain SavingAccount objects. Ensure that this class should not allow duplicates as well as data should be displayed in sorted order. (as per acc_ID)  
*/

package com.capgemini.advancecollections.savingsaccount.model;

import java.io.Serializable;

/**
 * 
 * @author Rohan Bhosale
 * class SavingsAccount implements Serializable which allow user to perform serialization and Deserialization, consists of two public methods i.e withdraw() and deposit() to perform transaction operation along with exception case ,overridden toString(), hashCode() and equals() method;
 */
public class SavingsAccount  implements Serializable {
	private double accountBalance;
	private static int id=100; 	//static to generate it automatically;
	private String accountName;
	private boolean isSalaryAccount;
	private int newAccountNumber;
	
	/**
	 * parameterized constructor of class SavingsAccount;
	 * @param accountBalance
	 * @param accountName
	 * @param isSalaryAccount
	 */
	public SavingsAccount(double accountBalance, String accountName, boolean isSalaryAccount) {
		this.accountBalance = accountBalance;
		this.newAccountNumber = id++;
		this.accountName = accountName;
		this.isSalaryAccount = isSalaryAccount;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
	/**
	 * method to deposit amount into user's saving account;
	 * @param accountNumber
	 */
	public void setAccountBalance(double accountNumber) {
		this.accountBalance = accountBalance;
	}

	public int getNewAccountNumber() {
		return newAccountNumber;
	}

	public void setNewAccountNumber(int newAccountNumber) {
		this.newAccountNumber = id;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
	/**
	 * method to withdraw amount from user's saving account ,throws exception if amount is negative or greater than account balance;
	 * @param amountToWithdraw
	 * @throws InvalidAmountException
	 * @throws InsufficientFundException
	 */
	public void withdraw( double amountToWithdraw) throws InvalidAmountException, InsufficientFundException {
		if(amountToWithdraw< accountBalance && amountToWithdraw>0 )
		accountBalance = accountBalance - amountToWithdraw;
		if(amountToWithdraw<0) throw new InvalidAmountException("Invalid Input Amount !!!");
		if(amountToWithdraw> accountBalance) throw new InsufficientFundException("Insufficient Balance !!!");
	}
	
	/**
	 * methd to deposit amount into user's savingAccount;
	 * @param amountToDeposit
	 */
	public void deposit(double amountToDeposit) {
		accountBalance = accountBalance + amountToDeposit;
	}

	
	/**
	 * Overridden method to display the values of the parameters;
	 */
	@Override
	public String toString() {
		return "SavingsAccount [AccountNumber=" + newAccountNumber
				+ ", AccountName=" + accountName + ", AccountBalance="
				+ accountBalance + ", isSalaryAccount=" + isSalaryAccount
				+ "]";
	}

	/**
	 * Overridden method to check the hashcode;
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountName == null) ? 0 : accountName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(accountBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + (isSalaryAccount ? 1231 : 1237);
		return result;
	}

	/**
	 * Overriden method to compare hashcode and store it;
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingsAccount other = (SavingsAccount) obj;
		if (accountName == null) {
			if (other.accountName != null)
				return false;
		} else if (!accountName.equals(other.accountName))
			return false;
		if (Double.doubleToLongBits(accountBalance) != Double.doubleToLongBits(other.accountBalance))
			return false;
		if (id != other.id)
			return false;
		if (isSalaryAccount != other.isSalaryAccount)
			return false;
		return true;
	}

	
}

