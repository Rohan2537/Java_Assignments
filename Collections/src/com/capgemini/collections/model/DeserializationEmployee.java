/*	5) Create an employee class with id, name and salary.
	Create a class with main() write a code to persist the object in the file.
	Create another class with main() write code to read the object from the file.
	run the first main(), this should write the object in file succesfullky.
	now run the second main(), this should read the object from the file and display it on the console screen.
	HINT:- Use Serialization and Deserialization*/

package com.capgemini.collections.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		String filename = "Employee.text";
		Employee employee=null;

		try {
			FileInputStream file = new FileInputStream(filename); // Reading the object from the file;
			ObjectInputStream inputfile = new ObjectInputStream(file);

			employee = (Employee) inputfile.readObject();

			inputfile.close();
			file.close();
			System.out.println(employee.toString());
		}

		catch (IOException ex) {
			ex.printStackTrace();
		}

		catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}

	}

}
