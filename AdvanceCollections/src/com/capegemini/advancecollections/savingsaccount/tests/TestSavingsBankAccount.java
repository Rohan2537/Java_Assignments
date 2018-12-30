/*	1)	Create a Class SavingAccount with field�s acc_balance, acc_ID, accountHoldername, isSalaryAccount. Also add setter and getter methods with business method like withdraw and deposit.
	a.	Create 5 different object of SavingAccount and add them into ArrayList, now interate the arraylist and display all SavingAccount�s object one by one.
	b.	Now save the ArrayList which contains SavingAccount�s object into a file and read the file and display all savingAccount Object one by one.
	c.	Create class BankAccountList which will maintain SavingAccount objects. Ensure that this class should not allow duplicates as well as data should be displayed in sorted order. (as per acc_ID)  
*/

package com.capgemini.advancecollections.savingsaccount.tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

public class TestSavingsBankAccount {

	@Test
	public void testForSavingsAccountBankSerialization() {

		SavingsAccount accountOne = new SavingsAccount(20000, "Rohan", true); // Objects of class SavingsAccount;
		SavingsAccount accountTwo = new SavingsAccount(15000, "Shubham", true);
		SavingsAccount accountThree = new SavingsAccount(14000, "Tushar", true);
		SavingsAccount accountFour = new SavingsAccount(21000, "Shubham", true);
		SavingsAccount accountFive = new SavingsAccount(16000, "Tejas", true);

		ArrayList<SavingsAccount> list = new ArrayList<SavingsAccount>(); // ArrayList to add objects and display-Unordered,Duplicates-allowed;
		list.add(accountOne);
		list.add(accountTwo);
		list.add(accountThree);
		list.add(accountFour);
		list.add(accountFive);
		Iterator<SavingsAccount> counter = list.iterator(); // Iterates next element;
		while (counter.hasNext()) {
			System.out.println(counter.next());
		}
		BankAccountList bankList = new BankAccountList();
		try {
			bankList.serializationOfSavingsBankAccount(list,"SavingsAccountOne.text");
			assertEquals(true, true);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testForDeSerializationOfSavingsAccount() { // test for Deserialization of BankAccountList;
		BankAccountList bankListOne = new BankAccountList();
		try {
			bankListOne.deserializationOfSavingsBankAccount("SavingsAccountOne.text");
			assertEquals(true, true);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}
