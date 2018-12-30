


package com.capgemini.inheritance.framework.mmbank.model;



/**
 * 
 * @author Rohan Bhosale
 *class BankAccount is an abstract class consists of various fields such as accountNumber,accountName,acoountBalance which stores the basic information of user's 
 * account details and an abstract method withdraw which gives the status of account on successful withdrawal of amount along with overriding toString() method.
 */
public abstract class BankAcccount {
private int accountNumber;
private String accountName;
private float accountBalance;
	
/**
 * It is a parameterized constructor of class BankAccount to initialize the instance variables;
 * @param accountNumber
 * @param accountName
 * @param accountBalance
 */
	public BankAcccount(int accountNumber, String accountName,float accountBalance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public float getAccountBalance() {
		return accountBalance;
	}

	public abstract void withdraw(float amountToWithdraw) throws InvalidAmountException, InsufficientFundException;
	
	public void deposit(float amountToDeposit){
		this.accountBalance+=amountToDeposit; 
	}
/**
 * Overridden toString() method which returns the value of all the parameters;
 */
	@Override
	public String toString() {
		return "BankAcccount [accountNumber=" + accountNumber
				+ ", accountName=" + accountName + ", accountBalance="
				+ accountBalance + "]";
	}
	
	
}
