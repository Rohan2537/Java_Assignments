package com.capgemini.inheritance.framework.mmbank.model;

/**
 * 
 * @author Rohan Bhosale
 *class MMCurrentAccount extends class CurrentAccount having two overridden methods to get withdraw status and to display values of parameters;
 */
public class MMCurrentAccount extends CurrentAccount {

	/**
	 * Constructor of class MMCurrentAccount to initialize the parameters;
	 * @param accountNumber
	 * @param accountName
	 * @param accountBalance
	 * @param creditLimit
	 */
	public MMCurrentAccount(int accountNumber, String accountName,float accountBalance, float creditLimit) {
		super(accountNumber, accountName, accountBalance, creditLimit);
		
	}

	/**
	 * Overridden method from parent class SavingsAccount;
	 * @throws InvalidAmountException 
	 * @throws InsufficientFundException 
	 */
	@Override
	public void withdraw(float amountToWithdraw) throws InvalidAmountException, InsufficientFundException {
		super.withdraw(amountToWithdraw);
	}

	/**
	 * Overridden method from parent class CurrentAccount;
	 */
	@Override
	public String toString() {
		return super.toString();
	}

	
}
