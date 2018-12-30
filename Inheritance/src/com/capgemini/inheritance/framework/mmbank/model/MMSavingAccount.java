package com.capgemini.inheritance.framework.mmbank.model;



/**
 * 
 * @author Rohan Bhosale
 *class MMSavingAccount extends class SavingsAccount having two overridden methods to get withdraw status and one static method to get minimum balance in account;
 */
public class MMSavingAccount extends SavingsAccount {
private static final float minimumBalance = 0;
	
/**
 * Constructor of class MMSavingAccount to initialize the parameters;
 * @param accountNumber
 * @param accountName
 * @param accountBalance
 * @param isSalaried
 */
	public MMSavingAccount(int accountNumber, String accountName,float accountBalance, boolean isSalaried) {
		super(accountNumber, accountName, accountBalance, isSalaried);
	}

	public static float getMinimumbalance() {
		return minimumBalance;
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
	 * Overridden method from parent class SavingsAccount;
	 */
	@Override
	public String toString() {
		return super.toString();
	}

	
}

