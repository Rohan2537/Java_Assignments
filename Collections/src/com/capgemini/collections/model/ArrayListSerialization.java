/*	6) create a class "MyClass".
	create 5 different objects of it.
	add them in an arraylist.
	store arraylist in file.
	Now open a file, read arraylist and display all objects.
	HINT:- Use Serialization and Desrialization with Collection
  */

package com.capgemini.collections.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * 
 * @author Rohan Bhosale
 *Serialization class for MyClass consists of five objects and an ArrayList;
 */
public class ArrayListSerialization {

	public static void main(String[] args) throws IOException {
		String filename = "MyClass.text"; 
		
		MyClass firstEmployee = new MyClass("Rohan",100);
		MyClass secondEmployee = new MyClass("Shubham",101);
		MyClass threeEmployee = new MyClass("Tushar",102);
		MyClass fourEmployee = new MyClass("Tejas",103);
		MyClass fiveEmployee = new MyClass("Shubh",104);
		
		ArrayList arraylist = new ArrayList();	//Arraylist to add elements;
		
		arraylist.add(firstEmployee);
		arraylist.add(secondEmployee);
		arraylist.add(threeEmployee);
		arraylist.add(fourEmployee);
		arraylist.add(fiveEmployee);
		
		
		  FileOutputStream file = new FileOutputStream(filename);   //Saving of object in a file 
          ObjectOutputStream outputFile = new ObjectOutputStream(file); 
            
          outputFile.writeObject(arraylist); 	 // Method for serialization of object   
          outputFile.close(); 
          file.close();
	}
	
}
