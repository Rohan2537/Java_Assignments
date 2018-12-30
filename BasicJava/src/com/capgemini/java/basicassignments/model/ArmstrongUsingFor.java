/*
 3)	Find out all the Armstrong numbers falling in the range of 100-999
 */

package com.capgemini.java.basicassignments.model;

public class ArmstrongUsingFor {

	public static void main(String[] args) {
		int result, value;
		int number;
		for (number = 100; number < 1000; number++) {
			result = 0;
			int n = number;
			while (n > 0) {
				value = n % 10;
				n = n / 10;
				result = result + (value * value * value);
			}
			if (number == result)
				System.out.println(+number + "Armstrong number");

		}
	}
}
