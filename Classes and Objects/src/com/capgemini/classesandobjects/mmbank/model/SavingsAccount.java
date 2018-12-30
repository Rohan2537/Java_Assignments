/* 	Create a project for Money Money Bank. Money Money Bank is our banking client and they want us to create a solution for their business problem.

MM bank deals with Savings Account, the expectation is, anyone can open savings account in MM bank by just giving their basic info like name, and initial balance. Every time the account object is created new account number is generated automatically and assigned to the accountNumber instance member, no two account object will have same account number.

customers can also open account without balance, which is a Zero balance account.

account has services like withdraw and deposit, anyone having an account object can use these services and on usage accordingly their accountBalance will change.

On printing the reference of an account through S.O.P it should display the account details on the console.

bank also provide a service, getNextAccountNumber() which is a kind of a open service that is open to all the people so, that even if a person does not have an account object he/she can still call this function to know what will be the next accountNumber if he/she opens an account in MM bank. So, even if their is no account object created yet, we should be able to call getNextAccountNumber().


create multiple account objects and test if it works as per the expectation of our client.

-------------------------------------------------------------------------------------------
Hint for Generating unique account number:-
	1) use of static 
	2) use of Initializers(Self-Study)
		Study about initializers and implement it as per your understanding.
---------------------------------------------------------------------------------------------


Also, Complete the Implementation of the given PaymentGateway class:-


class PaymentGateway
{ 
	//method to transfer the given amount from the src to target account.
	public static boolean transfer(SavingsAccount sender, SavingsAccount reciever, double amount) 
	{
		//If the sender account balance = the given amount then the amount is transferred from the sender to the reciever account and true is returned
		//otherwise false is returned.
	}
}

----------------------------------------
BEST PRACTICE:-
	1) Naming Convention for classes, objects, instance member, methods and local variable must be followed properly.
	2) Comments are mandatory above every classes and every methods.
	3) Code must be properly Indented.
	4) Code must be properly grouped in together with related statements.
	5) reading and displaying of data should only be done in main method.
	6) Make sure you don't repeat any code statements in functions or constructors.
	7) write TestCases for withdraw, deposit and fundTransfer
*/

package com.capgemini.classesandobjects.mmbank.model;

public class SavingsAccount {

	public static void main(String[] args) 
	{
		SavingsAccount userOne = new SavingsAccount("Rohan",2000);			//object one for class SavingsAccount;
		
		System.out.println("Username: " +userOne.name);
		System.out.println("Initial Balance: " +userOne.getInitialBalance());
		System.out.println("Account number: " +userOne.getNextAccountNumber());
		
		userOne.deposit(7000);
		System.out.println("New Balance :" +userOne.getInitialBalance());
		
		userOne.withdraw(500);
		System.out.println("Balance Remaining :" +userOne.getInitialBalance());
		
		SavingsAccount userTwo = new SavingsAccount("Shubham",5000);				//object two for class SavingsAccount;

		System.out.println("Username: " +userTwo.name);
		System.out.println("Initial Balance: " +userTwo.getInitialBalance());
		System.out.println("Account number: " +userTwo.getNextAccountNumber());
		
	
		userTwo.deposit(5000);
		System.out.println("New Balance :" +userTwo.getInitialBalance());
		
		userTwo.withdraw(500);
		System.out.println("Balance Remaining :" +userTwo.getInitialBalance());
		
		
		SavingsAccount userThree = new SavingsAccount("Tushar",0);				//object three for class SavingsAccount;

		System.out.println("Username: " +userThree.name);
		System.out.println("Initial Balance: " +userThree.initialBalance);
		System.out.println("Account number: " +userThree.getNextAccountNumber());
		
		userThree.deposit(5000);
		System.out.println("New Balance :" +userThree.getInitialBalance());
		
		userThree.withdraw(500);
		System.out.println("Balance Remaining :" +userThree.getInitialBalance());
		
	}
	private String name;
	private  double  initialBalance;
	private static int accountNumber = 100;
	private int nextAccountNumber;
	
	public SavingsAccount( String name,double initialBalance)					// constructor for class SavingsAccount;
	{
		this.name=name;
		this.initialBalance=initialBalance;
		nextAccountNumber = accountNumber++;
	}
	
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}


	public double getInitialBalance() 
	{
		return initialBalance;
	}

	public  void setInitialBalance(double initialBalance) 
	{
		this.initialBalance = initialBalance;
	}

	public static int getNextAccountNumber() 
	{
		return accountNumber;
	}


	public double withdraw(double amountToWithdraw)
	{
		initialBalance -= amountToWithdraw;
		return initialBalance;
		
	}
	
	public  double deposit(double amountToDeposit)
	{
	  this.initialBalance+=amountToDeposit;
		return this.initialBalance;
	}
	
	
}
