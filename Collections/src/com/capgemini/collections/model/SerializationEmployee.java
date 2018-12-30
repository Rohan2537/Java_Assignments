/*	5) Create an employee class with id, name and salary.
	Create a class with main() write a code to persist the object in the file.
	Create another class with main() write code to read the object from the file.
	run the first main(), this should write the object in file succesfullky.
	now run the second main(), this should read the object from the file and display it on the console screen.
	HINT:- Use Serialization and Deserialization*/

package com.capgemini.collections.model;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Serialization 
{ 
    public static void main(String[] args) 
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

} 