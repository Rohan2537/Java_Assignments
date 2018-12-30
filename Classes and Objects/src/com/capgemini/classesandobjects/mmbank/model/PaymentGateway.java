package com.capgemini.classesandobjects.mmbank.model;

public class PaymentGateway {

	public static boolean transfer(SavingsAccount senderAccountNumber, SavingsAccount recieverAccountNumber, double amountToTransfer) 
	{
		if(senderAccountNumber.getInitialBalance()>=amountToTransfer){
			double newBalanceReceiver = recieverAccountNumber.getInitialBalance()+ amountToTransfer;
			double newBalanceSender= senderAccountNumber.getInitialBalance()-amountToTransfer;
			return true;
		}
		//If the sender account balance = the given amount then the amount is transferred from the sender to the reciever account and true is
		 return false;
		//otherwise false is returned.
	}
}
