/*2)	Find out if the given number is an Armstrong number.
 Logic: - if 153 is the Supplied value, then  13 + 53 + 33 = 1+125+27 = 153 
 This is the same as supplied value hence it is an Armstrong number
 */

package com.capgemini.java.basicassignments.model;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int result = 0, value, temp;
		int number = 153;
		temp = number;
		while (number > 0) {
			value = number % 10;
			number = number / 10;
			result = result + (value * value * value);
		}
		if (temp == result)
			System.out.println("Armstrong number");
		else
			System.out.println("Not armstrong number");
	}
}
