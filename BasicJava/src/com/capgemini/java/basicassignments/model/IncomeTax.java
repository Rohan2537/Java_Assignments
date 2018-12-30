/*5)	Calculate the income tax on the basis of following  table.
 Note:-Assume slab is consider for Male, Female as well as Senior citizen
 Slab	Income Range	Tax payable in Percentage
 Slab A	0-1,80,000				Nil
 Slab B	1,81,001-3,00,000		10%
 Slab C	3,00,001-5,00,000		20%
 Slab D	5,00,001-10,00,000		30%
 Accept CTC from user and display tax amount 
 */

package com.capgemini.java.basicassignments.model;

import java.util.*;

public class IncomeTax {

	public static void main(String[] args) {
		String slab = "";
		float tax = 0;
		int income_Range = 0;
		System.out.println("Enter a Slab to calculate: A,B,C,D - ");
		Scanner sc = new Scanner(System.in);
		slab = sc.next();
		System.out.println("Enter income to calculate the tax: ");
		income_Range = sc.nextInt();

		switch (slab) {
		case "A":
			if (income_Range > 0 && income_Range < 180000) {
				System.out.println("Nil");
				break;
			}
		case "B":
			if (income_Range >= 181001 && income_Range < 300000) {
				tax = (float) (0.10 * income_Range);
				System.out.println("Tax amount is:" + tax);
				break;
			}
		case "C":
			if (income_Range >= 300001 && income_Range < 500000) {
				tax = (float) (0.20 * income_Range);
				System.out.println("Tax amount is:" + tax);
				break;
			}
		case "D":
			if (income_Range >= 500001 && income_Range < 1000000) {
				tax = (float) (0.30 * income_Range);
				System.out.println("Tax amount is:" + tax);
				break;
			}
		}
	}
}
