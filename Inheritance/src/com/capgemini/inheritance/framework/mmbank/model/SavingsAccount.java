package com.capgemini.inheritance.framework.mmbank.model;


public abstract class SavingsAccount extends BankAcccount {
private boolean isSalaried;
	
/**
 * Constructor of class SavingsAccount to initialize the parameters;
 * @param accountNumber
 * @param accountName
 * @param accountBalance
 * @param isSalaried
 */
public SavingsAccount(int accountNumber, String accountName,float accountBalance,boolean isSalaried) {
		super(accountNumber, accountName, accountBalance);
		this.setSalaried(isSalaried);
	}

public boolean isSalaried() {
	return isSalaried;
}

public void setSalaried(boolean isSalaried) {
	this.isSalaried = isSalaried;
}

/**
 * Overridden method from class BankAccount;
 */
@Override
public void withdraw(float amountToWithdraw) throws InvalidAmountException,InsufficientFundException  {
	if(amountToWithdraw >0 && amountToWithdraw<= this.getAccountBalance())
	super.deposit(-amountToWithdraw);
	if(amountToWithdraw<0)throw new InvalidAmountException("Invalid input Amount !!!");
	if(amountToWithdraw>this.getAccountBalance()) throw new InsufficientFundException("Insufficient Balance !!!");
}


/**
 * Overridden method to display values of the parameters;
 */
@Override
public String toString() {
	return "SavingsAccount [isSalaried=" + isSalaried + ", Account Name :" + getAccountName()
			+ ", getAccountNumber()=" + getAccountNumber()
			+ ", Account Balance :" + getAccountBalance() + "]";
}


}
