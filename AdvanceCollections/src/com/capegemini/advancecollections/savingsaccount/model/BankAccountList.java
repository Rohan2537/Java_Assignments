/*	1)	Create a Class SavingAccount with field�s acc_balance, acc_ID, accountHoldername, isSalaryAccount. Also add setter and getter methods with business method like withdraw and deposit.
	a.	Create 5 different object of SavingAccount and add them into ArrayList, now interate the arraylist and display all SavingAccount�s object one by one.
	b.	Now save the ArrayList which contains SavingAccount�s object into a file and read the file and display all savingAccount Object one by one.
	c.	Create class BankAccountList which will maintain SavingAccount objects. Ensure that this class should not allow duplicates as well as data should be displayed in sorted order. (as per acc_ID)  
*/
package com.capgemini.advancecollections.savingsaccount.model;
import java.io.Serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Map;


public class BankAccountList {

	public void serializationOfSavingsBankAccount(ArrayList<SavingsAccount> list, String file) throws IOException{
		FileOutputStream fileInput = new FileOutputStream(file); // Saving of objects in a file- Serialization;
		ObjectOutputStream outputFile = new ObjectOutputStream(fileInput);

		outputFile.writeObject(list); // Writing Objects to file- Serialization;
		outputFile.close();
		fileInput.close();
	}
	
	public ArrayList deserializationOfSavingsBankAccount(String inputFile) throws IOException, ClassNotFoundException{
		FileInputStream fileInput = new FileInputStream(inputFile); // Reading the object from the file-Deserialization;
		ObjectInputStream outputFile = new ObjectInputStream(fileInput);

		ArrayList listOfAccounts = (ArrayList) outputFile.readObject();	//Read an object from the ObjectInputStream;
		fileInput.close();
		return listOfAccounts;	
	}

	public void serializationOfBankAccountList(Map<Integer, SavingsAccount> map, String file) throws IOException {
		FileOutputStream fileInput = new FileOutputStream(file); // Saving of objects in a file- Serialization;
		ObjectOutputStream outputFile = new ObjectOutputStream(fileInput);

		outputFile.writeObject(map); // Writing Objects to file- Serialization;
		outputFile.close();
		fileInput.close();
	}
	
	public Map deserializationOfBankAccountList(String inputFile) throws IOException, ClassNotFoundException{
		FileInputStream fileInput = new FileInputStream(inputFile); // Reading the object from the file-Deserialization;
		ObjectInputStream outputFile = new ObjectInputStream(fileInput);

		Map listOfAccounts = (Map) outputFile.readObject();	//Read an object from the ObjectInputStream;
		fileInput.close();
		return listOfAccounts;
	}
}
