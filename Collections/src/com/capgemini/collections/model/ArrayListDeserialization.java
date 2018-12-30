/*	6) create a class "MyClass".
	create 5 different objects of it.
	add them in an arraylist.
	store arraylist in file.
	Now open a file, read arraylist and display all objects.
	HINT:- Use Serialization and Desrialization with Collection
  */

package com.capgemini.collections.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 
 * @author Rohan Bhosale
 *DeSerialization class for MyClass to read the file;
 */
public class ArrayListDeserialization {

	public static void main(String[] args) {
		String filename = "MyClass.text";
		Object myClass = null;

		try {
			FileInputStream file = new FileInputStream(filename); // Reading the object from the file;
			ObjectInputStream inputfile = new ObjectInputStream(file);

			myClass =  inputfile.readObject();

			inputfile.close();
			file.close();
			System.out.println(myClass.toString());
		}

		catch (IOException ex) {
			ex.printStackTrace();
		}

		catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}

	}

}
