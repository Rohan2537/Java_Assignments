/* Complete the implementation of the given class:-


class Person
{ 
	private String name; // data member to store the name of a person.
	private Date dob; // data member to store the date of birth of a person.
	public Person(String n, int d, int m, int y) //constructor to initialize Person objects
	{
		//initialize the data members of the current Person object using the parameters. 
	}
	public void display()// method to display the details of a person.
	{
		//Person details should be displayed in the following format:
		//Name: Person Name
		//Date Of Birth: dd/mm/yyyy
		//Age: ... Years, ... Months, ... Days
	}
	public void olderOne(Person p) //method to identify the older of the two persons.
	{
		//Older one of the invoking and given person object is identified and its details are 
		//displayed in the following format:
		//.... is older than .... by ... years, ... months and ... days.
	}
}


Define the class named PersonTest  which contains main() method. In the main() method, 2 Person objects are created, their details are displayed and the older one among them is identifed and displayed; as follows below:-

NOTE:-Do not forget to write TestCases for method "olderOne(person)".

Let the Person Object be initialized by values ("Ram", 5, 6, 1980) and ("Shyam", 2, 3, 1987) 

First Person Details: 
Name: Ram
Date of Birth: 5/6/1980
Age: ... Years, ... Months, ... Days //actual values as per current date should be displayed.

Second Person Details: 
Name: Shayam 
Date of Birth: 2/3/1987
Age: ... Years, ... Months, ... Days //actual values as per current date should be displayed.

Ram is older than Shyam by 6 Years, 8 Months, 25 Days
*/

package com.capgemini.classesandobjects.objectmanipulation.person.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPerson {
	
	@Test
	public void testIsOlderPersonPersonOne()				//test to check older person for person one;
	{
		Person personOne = new Person("Ram", 5, 6, 1980);
		Person personTwo = new Person("Shyam", 2, 3, 1987);
		
		assertEquals("Ram is older than Shyam by 7 Years, 3 Months, 3 Days",personTwo.olderOne(personOne, personTwo));
	}


	@Test
	public void testIsOlderPersonPersonTwo()				//test to check older person for person two;
	{
		Person personOne = new Person("Ram", 5, 6, 1980);
		Person personTwo = new Person("Shyam", 5, 6, 1970);
		
		assertEquals("Shyam is older than Ram by 10 Years, 0 Months, 0 Days",personTwo.olderOne(personOne, personTwo));
	}
	

	@Test
	public void testIsOlderPersonWithSameAge()				//test to check older person for persons with same age input;
	{
		Person personOne = new Person("Ram", 5, 6, 1980);
		Person personTwo = new Person("Shyam", 5, 6, 1980);
		
		assertEquals("No difference as both were born on same day !!!",personTwo.olderOne(personOne, personTwo));
	}
	
}
