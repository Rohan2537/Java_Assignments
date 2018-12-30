/*	4)	Create two classes Employee_information and MMASaving_Account 
	a.	Employee_information class will have fields empID, Employee_name, employee_designation , Employee_salary, employee_comm with that they will have setter getter methods 
	b.	MMASaving Account class will have fields accountID, accountholder_name, account_balance, isSalaryAccount with that they will have setter and getter methods
	c.	Employee_information object and MMASaving_Account object belongs to a same entity assuming there are more than 5 entities how will you store the objects preserving the relation between them. 
*/

package com.capgemini.advancecollections.mmasavingsaccount.tests;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestEmployeeInformation {

	@Test
	public void testForEmployeeInformation() { //test to check the employee information;
		
		EmployeeInformation employeeOne = new EmployeeInformation(100,"Rohan","analyst",15000,90215478);	//object of class EmployeeInformation;
		MMASavingsAccount userOne = new MMASavingsAccount(10000,"Rohan",20000,true);	//object of class MMASavingsAccount;
		
		EmployeeInformation employeeTwo = new EmployeeInformation(101,"Shubham","analyst",15000,90215479);
		MMASavingsAccount userTwo = new MMASavingsAccount(10001,"Shubham",20000,true);
		
		EmployeeInformation employeeThree = new EmployeeInformation(102,"Tushar","analyst",15000,90215480);
		MMASavingsAccount userThree = new MMASavingsAccount(10002,"Tushar",20000,true);
		
		EmployeeInformation employeeFour = new EmployeeInformation(103,"Shubham","analyst",15000,90215481);
		MMASavingsAccount userFour = new MMASavingsAccount(10003,"Shubham",20000,true);
		
		EmployeeInformation employeeFive = new EmployeeInformation(104,"Tejas","analyst",15000,90215482);
		MMASavingsAccount userFive = new MMASavingsAccount(10004,"Tejas",20000,true);
		
		
		Map<EmployeeInformation,MMASavingsAccount> mapOne = new HashMap<EmployeeInformation, MMASavingsAccount>();	//map to store objects of EmployeeInformation,MMASavingsAccount- Map, Key -Value pair;
		mapOne.put(employeeOne, userOne);
		
		Map<EmployeeInformation,MMASavingsAccount> mapTwo = new HashMap<EmployeeInformation, MMASavingsAccount>();
		mapTwo.put(employeeTwo, userTwo);
		
		Map<EmployeeInformation,MMASavingsAccount> mapThree = new HashMap<EmployeeInformation, MMASavingsAccount>();
		mapThree.put(employeeThree, userThree);
		
		Map<EmployeeInformation,MMASavingsAccount> mapFour = new HashMap<EmployeeInformation, MMASavingsAccount>();
		mapFour.put(employeeFour, userFour);
		
		Map<EmployeeInformation,MMASavingsAccount> mapFive = new HashMap<EmployeeInformation, MMASavingsAccount>();
		mapFour.put(employeeFive, userFive);
		
		Map<Integer,Map> mapSix = new HashMap();
		mapSix.put(100, mapOne);
		mapSix.put(101, mapTwo);
		mapSix.put(102, mapThree);
		mapSix.put(103, mapFour);
		mapSix.put(104, mapFive);
		
		String expected = "{100={EmployeeInformation [id=100, employeeName=Rohan, employeeDesignation=analyst, employeeSalary=15000.0, employeeNumber=90215478]=MMASavingsAccount [accountId=10000, accountHolderName=Rohan, accountBalance=20000.0, isSalaryAccount=true]}, 101={EmployeeInformation [id=101, employeeName=Shubham, employeeDesignation=analyst, employeeSalary=15000.0, employeeNumber=90215479]=MMASavingsAccount [accountId=10001, accountHolderName=Shubham, accountBalance=20000.0, isSalaryAccount=true]}, 102={EmployeeInformation [id=102, employeeName=Tushar, employeeDesignation=analyst, employeeSalary=15000.0, employeeNumber=90215480]=MMASavingsAccount [accountId=10002, accountHolderName=Tushar, accountBalance=20000.0, isSalaryAccount=true]}, 103={EmployeeInformation [id=103, employeeName=Shubham, employeeDesignation=analyst, employeeSalary=15000.0, employeeNumber=90215481]=MMASavingsAccount [accountId=10003, accountHolderName=Shubham, accountBalance=20000.0, isSalaryAccount=true], EmployeeInformation [id=104, employeeName=Tejas, employeeDesignation=analyst, employeeSalary=15000.0, employeeNumber=90215482]=MMASavingsAccount [accountId=10004, accountHolderName=Tejas, accountBalance=20000.0, isSalaryAccount=true]}, 104={}}";
		assertEquals(expected,mapSix.toString());
		
	}

}
