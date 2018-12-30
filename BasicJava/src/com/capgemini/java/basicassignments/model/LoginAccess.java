/*7)	Consider a CUI based application, where you are asking a user to enter his Login name and 
 * 		password, after entering the valid user-id and password it will print the message �Welcome� along
 * 		with user name. As per the validation is concerned, the program should keep a track of login
 * 		attempts. After three attempts a message should be flashed saying �Contact Admin� and the
 * 	    program should terminate. */

package com.capgemini.java.basicassignments.model;

import java.util.*;

public class LoginAccess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 3;
		while (i > 0) {
			System.out.println("Enter your loginName :");
			String userName = sc.next();

			System.out.println("Enter your password :");
			String password = sc.next();

			if ((userName.equals("Rohan")) && (password.equals("123456789"))) {
				System.out.println("Welcome " + userName);
				System.exit(0);
			} else {
				i--;
				if (i != 0) {
					System.out.println("Authentication failed: incorrect credentials");
				} else {
					System.out.println("Contact Admin");
				}
			}
		}
	}
}
