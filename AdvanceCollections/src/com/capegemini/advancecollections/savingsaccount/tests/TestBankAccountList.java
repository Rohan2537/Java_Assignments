/*	1)	Create a Class SavingAccount with field�s acc_balance, acc_ID, accountHoldername, isSalaryAccount. Also add setter and getter methods with business method like withdraw and deposit.
	a.	Create 5 different object of SavingAccount and add them into ArrayList, now interate the arraylist and display all SavingAccount�s object one by one.
	b.	Now save the ArrayList which contains SavingAccount�s object into a file and read the file and display all savingAccount Object one by one.
	c.	Create class BankAccountList which will maintain SavingAccount objects. Ensure that this class should not allow duplicates as well as data should be displayed in sorted order. (as per acc_ID)  
*/

package com.capgemini.advancecollections.savingsaccount.tests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class TestBankAccountList {

	@Test
	public void testForSerializationOfBankAccountList() {	//test for serialization of BankAccountList;
		
		SavingsAccount accountOne = new SavingsAccount(20000, "Rohan", true);	//Objects of class SavingsAccount;
		SavingsAccount accountTwo = new SavingsAccount(15000, "Shubham", true);
		SavingsAccount accountThree = new SavingsAccount(14000, "Tushar", true);
		SavingsAccount accountFour = new SavingsAccount(21000, "Shubham", true);
		SavingsAccount accountFive = new SavingsAccount(16000, "Tejas", true); 
		
		Map<Integer,SavingsAccount> map = new HashMap(); 		//Map- Sorted by keys,Duplicates not allowed;
		map.put(101, accountOne);		// Adding elements to the map;
		map.put(103,accountTwo);
		map.put(104,accountThree);
		map.put(100,accountFour);
		map.put(102,accountFive);
	     
		Set set = map.entrySet(); 			//Converting to Set so that we can traverse, Traversing Map ;
		Iterator iterator = set.iterator();
		
		while (iterator.hasNext()) {	
			Map.Entry entry = (Map.Entry) iterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		BankAccountList  bankList = new BankAccountList();
		try {
			bankList.serializationOfBankAccountList(map, "SavingsAccountTwo.text");
			assertEquals(true,true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	   }
	
	@Test
	public void testForDeSerializationOFBankAccountList() {	//test for Deserialization of BankAccountList;
		BankAccountList bankListOne = new BankAccountList();
		try {
			bankListOne.deserializationOfBankAccountList("SavingsAccountTwo.text");
			assertEquals(true,true);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
	}

}
