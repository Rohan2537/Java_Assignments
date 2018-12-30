
/*8)	There is an Array which is of the size 15, which may or may not be sorted. You should write a program to accept a number and search if it in contained in the array   (linear search)
		.
		Example: 
		5	12	14	6	78	19	1	23	26	35	37	7	52	86	47
		Value to be search is 19
 */

package com.capgemini.java.basicassignments.model;

import java.util.*;

public class LinearSearch {

	public static void main(String[] args) 
	{
		
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};  //Value to be search is 19
	    
		System.out.println("Enter the value to search in array : ");
	    
		Scanner sc= new Scanner(System.in);
		int valueToSearch = sc.nextInt();
		
		for (int i = 0; i < 15; i++) 
	        if (arr[i] == valueToSearch)
	        {
	        	 System.out.println("Element is present at index : " +"[" +i +"]");	
	        }
	} 
	}


