package com.capgemini.inheritance.framework.mmbank.model;


/**
 * 
 * @author Rohan Bhosale
 *class MMBankFactory extends class BankFactory having two methods to get new Savings and current account number;
 */
public class MMBankFactory extends BankFactory {

	/**
	 * method having reference as MMSavingAccount to get new SavingsAccount number;
	 */
	public SavingsAccount getNewSavingAccount(int accountNumber,String accountName,int accountBalance,boolean isSalaried) {
		return new MMSavingAccount(accountNumber, accountName, accountBalance, isSalaried);
	}

	/**
	 * method having reference as MMCurrentAccount to get new CurrentAccount number;
	 */
	public CurrentAccount getNewCurrentAccount(CurrentAccount userTwo) {
		return null;
	}

}
