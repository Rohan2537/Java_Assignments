/*1)	Supple value to function and return the square table that value
 Example: - If Supplied value is 5,
 Output:  Square: 25

 Create the table of 5 and print the square of each number.
 Output = 25, 100, 225, 400�2500

 e.g 	5 * 1 = 5 �---------- 25
 5 * 2 = 10----------100
 5 * 3 = 15 ---------225
 .
 .
 .
 5 * 10 = 50 ----------2250
 */

package com.capgemini.java.basicassignments.model;

public class SquareNumber {

	public static void main(String[] args) {
		int number = 5;
		for (int i = 1; i <= 10; i++) {
			int result = number * i;
			System.out.println(+number + "*" + i + "------" + (result * result));
		}
	}

}
