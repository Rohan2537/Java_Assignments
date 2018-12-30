
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

package com.capgemini.classesandobjects.objectmanipulation.person.model;

import java.time.LocalDateTime;

public class Person {

	public static void main(String[] args)
	{
		Person personOne = new Person("Ram", 1, 3, 2000);		//objects of Person class;
		Person personTwo = new Person("Shyam", 2, 1, 2000);
		personOne.display();
		personTwo.display();
		personTwo.olderOne(personOne, personTwo);
		System.out.println(personTwo.olderOne(personOne, personTwo));
		
	}
	
	private String name;
	private int date;
	private int month;
	private int year;
	

	public Person(String name,int date,int month,int year) 					//constructor of class Person;
	{
		this.name = name;
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
	public void display()													// method to display the details of a person.
	{
	
		LocalDateTime now = LocalDateTime.now();							// now() returns current date,month,year to calculate the age difference;
		
		System.out.println("Name: " +this.name);
		System.out.println("Date Of Birth: " +this.date+"/"+this.month+"/"+this.year);
		System.out.println("Age: " +(now.getYear()-this.year) +" Years, " +(now.getMonthValue()-this.month)+" Months, " +(now.getDayOfMonth()-this.date)+" Days");
		
	}
	
	public String olderOne(Person personOne,Person personTwo)				 //method to identify the older of the two persons.
	{
		if(personOne.year<personTwo.year)
		{
			return personOne.name + " is older than " + personTwo.name +" by " +
					(personTwo.year-personOne.year+" Years, "+Math.abs(personTwo.month-personOne.month)+" Months, "+
							Math.abs(personTwo.date-personOne.date)+" Days") ;
		}
		else if((personTwo.year<personOne.year))
		{
			return personTwo.name + " is older than " + personOne.name +" by " +
				(personOne.year-personTwo.year+" Years, "+Math.abs(personTwo.month-personOne.month)+" Months, "+
						Math.abs(personTwo.date-personOne.date)+" Days") ;
		}
			
		else if(personOne.year==personTwo.year && personOne.month<personTwo.month )
		{
			return personOne.name + " is older than " + personTwo.name +" by " +
					(personTwo.year-personOne.year+" Years, "+Math.abs(personTwo.month-personOne.month)+" Months, "+
							Math.abs(personTwo.date-personOne.date)+" Days") ;
		}
		
		else if(personOne.year==personTwo.year && personTwo.month<personOne.month )
		{
			return personTwo.name + " is older than " + personOne.name +" by " +
					(personTwo.year-personOne.year+" Years, "+Math.abs(personTwo.month-personOne.month)+" Months, "+
							Math.abs(personTwo.date-personOne.date)+" Days") ;
		}
		
		else if(personOne.year==personTwo.year && personTwo.month==personOne.month && personTwo.date<personOne.date)
		{
			return personTwo.name + " is older than " + personOne.name +" by " +
					(personTwo.year-personOne.year+" Years, "+Math.abs(personTwo.month-personOne.month)+" Months, "+
							Math.abs(personTwo.date-personOne.date)+" Days") ;
		}
		
		else if(personOne.year==personTwo.year && personTwo.month==personOne.month && personOne.date<personTwo.date)
		{
			return personOne.name + " is older than " + personTwo.name +" by " +
					(personTwo.year-personOne.year+" Years, "+Math.abs(personTwo.month-personOne.month)+" Months, "+
							Math.abs(personTwo.date-personOne.date)+" Days") ;
		}
		return "No Difference as both were on the same day !!!";
	}

		
}
	
