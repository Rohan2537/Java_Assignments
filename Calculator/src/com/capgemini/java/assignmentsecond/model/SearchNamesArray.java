/*	Write a program to accept an array of names and a name and check whether the name is present in the array. Return the count of occurrence. Use the following array as input
	{�Dave�, �Ann�, �George�, �Sam�, �Ted�, �Gag�, �Saj�, �Agati�, �Mary�, �Sam�, �Ayan�, �Dev�, �Kity�, �Meery�, �Smith�, �Johnson�, �Bill�, �Williams�, �Jones�, �Brown�, �Davis�, �Miller�, �Wilson�, �Moore�, �Taylor, �Anderson�, �Thomas�, �Jackson�}
*/

package com.capgemini.java.assignmentsecond.model;

public class SearchNamesArray {

	public int SearchNameInArray(String name) {
		int index;
		int counter = 0;
		String names[] = { "Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj",
				"Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery",
				"Smith", "Johnson", "Bill", "Williams", "Jones", "Brown",
				"Davis", "Miller", "Wilson","Dave", "Moore", "Taylor", "Anderson",
				"Thomas", "Jackson","Dave" };

		for (index = 0; index < names.length; index++) {
			if (name.compareTo(names[index]) == 0) {
				counter++;
			} 
				
		}
		return counter;

	}
}