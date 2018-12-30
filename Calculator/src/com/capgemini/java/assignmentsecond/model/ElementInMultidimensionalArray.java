/*	Write a program to find if a particular element is present in a multi-dimensional array.*/

package com.capgemini.java.assignmentsecond.model;

public class ElementInMultidimensionalArray {


	public boolean searchElement(int numberToSearch, int[][] numbersArray) {

		for(int row=0;row<numbersArray.length;row++){
			
			for(int column=0;column<numbersArray[0].length;column++){
				
				if(numberToSearch == numbersArray[row][column]){
					return true;
				}
			}
			
		}
		
		return false;
	}

}