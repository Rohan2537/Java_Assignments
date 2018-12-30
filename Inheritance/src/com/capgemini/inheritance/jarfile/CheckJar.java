
package com.inheritance.checkjar;

import com.inheritance.jar.addfile.Add;
import com.capgemini.inheritance.jarfile;

/**
 * 
 * @author Rohan Bhosale
 *This class checks the included Jars in the class and using it to create it's instances and access it's methods.
 */
public class CheckJar {

	public static void main(String[] args) {
		Add input = new Add();							//for JAR Add;
		input.additionOfTwoNumbers(50, 50);
		System.out.println(input.additionOfTwoNumbers(50, 50));
	
		Person person = new Person("Rohan", 100);	//for JAR person;
		System.out.println(person);
	}
	 
	
}
