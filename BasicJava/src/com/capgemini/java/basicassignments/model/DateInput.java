/*6)	 Take complete date from the user in the form of (DD,MM,YYYY) and Display the date in the form given below:
		 DD/Month-Name/YYYY
		 Example: - Input 09,07,2010 
		 Output: -09/July/2010
 */
package com.capgemini.java.basicassignments.model;

import java.util.*;

public class DateInput {

	public static void main(String[] args) {

		Scanner dateInput = new Scanner(System.in);

		System.out.println("Enter the Date: ");
		int date = dateInput.nextInt();

		Scanner monthInput = new Scanner(System.in);
		System.out.println("Enter the Month: ");
		int month = monthInput.nextInt();

		Scanner yearInput = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year = yearInput.nextInt();

		switch (month) {
		case 01: {
			System.out.println(+date + "/" + "January" + "/" + year);
			break;
		}
		case 02: {
			System.out.println(+date + "/" + "February" + "/" + year);
			break;
		}
		case 03: {
			System.out.println(+date + "/" + "March" + "/" + year);
			break;
		}
		case 04: {
			System.out.println(+date + "/" + "April" + "/" + year);
			break;
		}
		case 05: {
			System.out.println(+date + "/" + "May" + "/" + year);
			break;
		}
		case 06: {
			System.out.println(+date + "/" + "June" + "/" + year);
			break;
		}
		case 07: {
			System.out.println(+date + "/" + "July" + "/" + year);
			break;
		}
		case 8: {
			System.out.println(+date + "/" + "August" + "/" + year);
			break;
		}
		case 9: {
			System.out.println(+date + "/" + "September" + "/" + year);
			break;
		}
		case 10: {
			System.out.println(+date + "/" + "October" + "/" + year);
			break;
		}
		case 11: {
			System.out.println(+date + "/" + "November" + "/" + year);
			break;
		}
		case 12: {
			System.out.println(+date + "/" + "December" + "/" + year);
			break;
		}
		}
	}
}
