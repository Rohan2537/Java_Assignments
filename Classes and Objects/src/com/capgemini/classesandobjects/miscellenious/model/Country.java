/*	Define a class Country that stores the name of the country, its population, and its area. Using that class, write a test program that creates a few countries and stores them in an array and then prints

	The country with the largest area
	The country with the largest population
	The country with the largest population density (people per square mile)

	NOTE: Write appropriate TestCases.
*/

package com.capgemini.classesandobjects.miscellenious.model;

public class Country {

	private String countryName;
	private int countryPopulation;
	private int countryArea;

	public Country(String countryName, int countryPopulation, int countryArea) // constructor
																				// for
																				// class
																				// Country;
	{
		this.countryName = countryName;
		this.countryPopulation = countryPopulation;
		this.countryArea = countryArea;
	}

	public String getCountryName() // getter for countryName;
	{
		return countryName;
	}

	public void setCountryName(String countryName) // setter for countryName;
	{
		this.countryName = countryName;
	}

	public int getCountryPopulation() // getter for countryPopulation;
	{
		return countryPopulation;
	}

	public void setCountryPopulation(int countryPopulation) // setter for
															// countryPopulation;
	{
		this.countryPopulation = countryPopulation;
	}

	public int getCountryArea() // getter for countryArea;
	{
		return countryArea;
	}

	public void setCountryArea(int countryArea) // setter for countryArea;
	{
		this.countryArea = countryArea;
	}

}
