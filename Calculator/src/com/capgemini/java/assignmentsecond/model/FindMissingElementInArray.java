/*Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

	Example 1:

	Input: [3,0,1]
	Output: 2
	Example 2:

	Input: [9,6,4,2,3,5,7,0,1]
	Output: 8*/

package com.capgemini.java.assignmentsecond.model;

class FindMissingElementInArray{
	
		public int missingElement(int[] numbers){
		 
		for ( int innercounter = 0; innercounter < numbers.length; innercounter++) 
        {
            for (int outercounter = innercounter + 1; outercounter < numbers.length; outercounter++) 
            {
                if (numbers[innercounter] > numbers[outercounter]) 
                {
                	int temp = numbers[innercounter];
                	numbers[innercounter] = numbers[outercounter];
                	numbers[outercounter] = temp;
                }
            }
        }
		
		for(int counter=0;counter<numbers.length;counter++){
			if(numbers[counter]+1!= numbers[counter+1]){
				return ++numbers[counter];
			}
		}
	
		return 0;
	}	
}	
	
	
	
	
	
	
	
	

	
	
	
	

