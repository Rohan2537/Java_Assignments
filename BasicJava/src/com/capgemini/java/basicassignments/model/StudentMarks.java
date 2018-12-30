/* 
4)	Provide  marks of three subject and declare the result, result declaration is based on  below conditions:
	Condition 1: -All subjects marks is greater than 60 is Passed 
	Condition 2: -Any two subjects marks is greater than 60 is Promoted
	Condition 3: -Any one subject marks is greater than 60 or all subjects� marks less than 60 is failed. */

package com.capgemini.java.basicassignments.model;

public class StudentMarks {

	public static void main(String[] args) {
		int English = 80, Maths = 70, Science = 75;
		if (English > 60 && Maths > 60 && Science > 60) {
			System.out.println("Passed");
		} else if ((English > 60 && Maths > 60) || (Maths > 60 && Science > 60)
				|| (Science > 60 && English > 60)) {
			System.out.println("Promoted");
		} else
			System.out.println("failed");

	}

}
