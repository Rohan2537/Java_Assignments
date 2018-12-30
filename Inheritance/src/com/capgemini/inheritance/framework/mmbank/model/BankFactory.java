package com.capgemini.inheritance.framework.mmbank.model;

	/**
	 * 
	 * @author Rohan Bhosale
	 *class BankFactory is an abstract class consists of two public methods of type SavingsAccount and CurrentAccount;
	 */
	public abstract class BankFactory {

		/**
		 * method having reference as SavingsAccount to get new savings account number;
		 * @param userOne
		 * @return
		 */
		public SavingsAccount getNewSavingAccount(SavingsAccount userOne){
			return null;
			
		}
		
		/**
		 * method having reference as CurrentAccount to get new current account number;
		 * @param userTwo
		 * @return
		 */
		public CurrentAccount getNewCurrentAccount(CurrentAccount userTwo){
			return null;
			
		}
	}


