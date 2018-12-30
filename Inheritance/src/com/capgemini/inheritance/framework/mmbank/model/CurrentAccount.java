package com.capgemini.inheritance.framework.mmbank.model;

	/**
	 * 
	 * @author Rohan Bhosale
	 *class CurrentAccount is an abstract class which extends class BankAcccount having two overridden methods withdraw and toString();
	 */
	public abstract class CurrentAccount extends BankAcccount {
	private float creditLimit;
		
	/**
	 * constructor of class CurrentAccount;
	 * @param accountNumber
	 * @param accountName
	 * @param accountBalance
	 * @param creditLimit
	 */
		public CurrentAccount(int accountNumber, String accountName,float accountBalance,float creditLimit) {
			super(accountNumber, accountName, accountBalance);
			this.creditLimit = creditLimit;
		}
		
		public float getCreditLimit() {
			return creditLimit;
		}

		/**
		 * Overridden method from class BankAccount;
		 * @throws InvalidAmountException 
		 */
		@Override
		public void withdraw(float amountToWithdraw) throws InvalidAmountException,InsufficientFundException {
		if(amountToWithdraw>0 && amountToWithdraw<=this.getAccountBalance()+creditLimit)
			super.deposit(-amountToWithdraw);
		if(amountToWithdraw<0) throw new InvalidAmountException("Invalid Input Amount !!!");
		
		if(amountToWithdraw > this.getAccountBalance()+creditLimit)throw new InsufficientFundException("Can't Withdraw !!! Exceeding Minimum Maintain Balance. ");
		}
		/**
		 * Overridden method to display values of parameters;
		 */
		@Override
		public String toString() {
			return "CurrentAccount ["+"Credit Limit :" + getCreditLimit()
					+ ", Account Name :" + getAccountName()
					+ ", Account Number :" + getAccountNumber()
					+ ", AccountBalance :" + getAccountBalance() + "]";
		}

		
	}


