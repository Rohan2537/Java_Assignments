package com.capgemini.inheritance.framework.mmbank.tests;

import static org.junit.Assert.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Test;



public class TestFramework {
/**
 * test to check withdrawal of amount from savings account- amount (positive within account balance);
 */
	@Test
	public void testForMMBankSavingsAccountWithdrawForPositiveAmount() {
		Logger log = Logger.getLogger(TestFramework.class.getName());
		BasicConfigurator.configure();
		log.debug("Test begins...");
		SavingsAccount userOne = new MMSavingAccount(123456, "MMSavingsAccount",10000, true);
		try {
			try {
				userOne.withdraw(1000);
			} catch (InsufficientFundException e) {
				e.printStackTrace();
			}
		} catch (InvalidAmountException e) {
			e.printStackTrace();
		}
		Logger log1 = Logger.getLogger(TestFramework.class.getName());
		log1.debug("Test ends !!!");
	}

	/**
	 * test to check withdrawal of amount from savings account- amount (exceeding than account balance- throws InsufficientFundException));
	 */
	@Test
	public void testForMMBankSavingsAccountWithdrawForExceedingAmount() {

		SavingsAccount userOne = new MMSavingAccount(123456,"MMSavingsAccount", 10000, true);
		try {
			try {
				userOne.withdraw(11000);
			} catch (InsufficientFundException e) {
				e.printStackTrace();
			}
		} catch (InvalidAmountException e) {
			e.printStackTrace();
		}

	}

	/**
	 * test to check withdrawal of amount from savings account- amount (negative - throws InvalidInputException);
	 */
	@Test
	public void testForMMBankSavingsAccountWithdrawForNegativeAmount() {

		SavingsAccount userOne = new MMSavingAccount(123456,"MMSavingsAccount", 10000, true);
		try {
			try {
				userOne.withdraw(-2000);
			} catch (InsufficientFundException e) {
				e.printStackTrace();
			}
		} catch (InvalidAmountException e) {
			e.printStackTrace();
		}
	}

	/**
	 * test to check withdrawal of amount from current account- amount (positive within account balance);
	 */
	@Test
	public void testForMMBankCurrentAccountWithdrawWithPositiveAmount() {

		CurrentAccount userTwo = new MMCurrentAccount(12345678,
				"MMCurrentAccount", 5000, 10000);
		try {
			try {
				userTwo.withdraw(18000);
			} catch (InsufficientFundException e) {
				e.printStackTrace();
			}
		} catch (InvalidAmountException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * test to check withdrawal of amount from current account- amount (exceeding account balance+creditLimit-throws insufficientFundException);
	 */
	@Test
	public void testForMMBankCurrentAccountWithdrawWithExceedingAmount() {

		CurrentAccount userTwo = new MMCurrentAccount(12345678,"MMCurrentAccount", 5000, 10000);
		try {
			try {
				userTwo.withdraw(18000);
			} catch (InsufficientFundException e) {
				e.printStackTrace();
			}
		} catch (InvalidAmountException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * test to check withdrawal of amount from current account- amount (negative- throws InvalidInputException);
	 */
	@Test
	public void testForMMBankCurrentAccountWithdrawWithNegativeAmount() {

		CurrentAccount userTwo = new MMCurrentAccount(12345678,	"MMCurrentAccount", 5000, 10000);
		try {
			try {
				userTwo.withdraw(-18000);
			} catch (InsufficientFundException e) {
				e.printStackTrace();
			}
		} catch (InvalidAmountException e) {
			e.printStackTrace();
		}
	}
}