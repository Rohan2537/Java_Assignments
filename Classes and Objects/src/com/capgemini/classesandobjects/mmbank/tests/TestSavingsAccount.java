package com.capgemini.classesandobjects.mmbank.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSavingsAccount {

	@Test
	public void testWithdrawForBank() 				//test to check withdraw for userOne;
	{
		SavingsAccount userOne = new SavingsAccount("Rohan",2000);
		assertEquals(1500,userOne.withdraw(500),0);
	}

	@Test
	public void testDepositForBank() 				//test to check deposit for userOne;
	{
		SavingsAccount userTwo = new SavingsAccount("Shubham",5000);	
		assertEquals(5500,userTwo.deposit(500),0);
	}
	
	@Test
	public void testReturnsTrueTransferAmountForBank() 		//test to  check true condition for amount transfer;
	{
		SavingsAccount userOne = new SavingsAccount("Rohan",10000);
		SavingsAccount userTwo = new SavingsAccount("Shubham",5000);	
		PaymentGateway firstUser = new PaymentGateway();
		assertEquals(true,firstUser.transfer(userOne, userTwo, 2500));
	}
	
	@Test
	public void testReturnsFalseTransferAmountForBank() 		//test to  check false condition for amount transfer;
	{
		SavingsAccount userOne = new SavingsAccount("Rohan",10000);
		SavingsAccount userTwo = new SavingsAccount("Shubham",5000);	
		PaymentGateway firstUser = new PaymentGateway();
		assertEquals(false,firstUser.transfer(userOne, userTwo, 11000));
	}
}
