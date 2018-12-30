/*	5) Create an employee class with id, name and salary.
	Create a class with main() write a code to persist the object in the file.
	Create another class with main() write code to read the object from the file.
	run the first main(), this should write the object in file succesfullky.
	now run the second main(), this should read the object from the file and display it on the console screen.
	HINT:- Use Serialization and Deserialization*/

package com.capgemini.collections.tests;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class TestSerializableEmployee {

	@Test
	public void testEmployeeSerializable() 
	{
		Employee object = new Employee("Rohan",100,20000); 
        String filename = "Employee.text"; 
         
        try
        {    
            FileOutputStream file = new FileOutputStream(filename);   //Saving of object in a file 
            ObjectOutputStream outputFile = new ObjectOutputStream(file); 
              
            outputFile.writeObject(object); 	 // Method for serialization of object   
            outputFile.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
        } 
        
        catch(IOException ex) 
        { 
            ex.printStackTrace(); 
        } 
	}
        @Test
        public void testEmployeeDeSerializable()
     {
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

