/*	Define a class Country that stores the name of the country, its population, and its area. Using that class, write a test program that creates a few countries and stores them in an array and then prints

	The country with the largest area
	The country with the largest population
	The country with the largest population density (people per square mile)

	NOTE: Write appropriate TestCases.
*/

package com.capgemini.classesandobjects.miscellenious.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCountry {
	public static void main(String[] args) {
		
	}
	private Country countryOne;
	private Country countryTwo;
	private Country countryThree;
	
	@Test
	public void testCountryWithHighestPopulation() 							//test for highest population; 
	{
		
		countryOne= new Country("USA", 1000, 10000);
		countryTwo= new Country("CHINA", 2000, 20000);
		countryThree= new Country("INDIA", 3000, 30000);
		
		Country[] countriesArray = {countryOne,countryTwo,countryThree};
	    int highestPopulation=0;
		for(int counter=0;counter<countriesArray.length;counter++)
		{
			if(highestPopulation < countriesArray[counter].getCountryPopulation())
			{
				highestPopulation=countriesArray[counter].getCountryPopulation();
			}
		}
		
		assertEquals(3000, highestPopulation);
	}
	
	@Test
	public void testCountryWithHighestArea() 									 //test for highest area;
	{
		
		countryOne= new Country("USA", 1000, 10000);
		countryTwo= new Country("CHINA", 2000, 20000);
		countryThree= new Country("INDIA", 3000, 30000);
		
		Country[] countriesArray = {countryOne,countryTwo,countryThree};
	    int highestArea=0;
	    
		for(int counter=0;counter<countriesArray.length;counter++)
		{
			if(highestArea < countriesArray[counter].getCountryArea())
			{
				highestArea=countriesArray[counter].getCountryArea();
			}
		}
		
		assertEquals(30000, highestArea);
	}
	
	@Test
	public void testCountryWithHighestPopulationDensity() 
	{																//test for highest population density of countries;
		
		countryOne= new Country("USA", 100000, 10000);
		countryTwo= new Country("CHINA", 200000, 20000);
		countryThree= new Country("INDIA", 300000, 30000);
		
		Country[] countriesArray = {countryOne,countryTwo,countryThree};
	    int highestPopulationDensity=0;
		
	    for(int counter=0;counter<countriesArray.length;counter++)
		{
			if(highestPopulationDensity < countriesArray[counter].getCountryPopulation()/countriesArray[counter].getCountryArea())
			{
				highestPopulationDensity=countriesArray[counter].getCountryPopulation()/countriesArray[counter].getCountryArea();
			}
		}
		
		assertEquals(10, highestPopulationDensity);
	}

}
