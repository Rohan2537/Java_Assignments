/*11)	Accept the marks of three students for the subject say A, B, C.
 *  Find the total scored and the average in all the subjects. Also Find the Total and Average scored by students */

package com.capgemini.java.basicassignments.model;

import java.util.*;

public class StudentSubjectsAverage {
	double english;
	double maths;
	double science;

	void marks() // method for marks;
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter English Marks:");
		english = sc.nextInt();

		System.out.println("Enter Maths Marks:");
		maths = sc.nextInt();

		System.out.println("Enter Science Marks:");
		science = sc.nextInt();
	}

	double totalScore() // method for calculating total score of a student;
	{
		double result = this.english + this.maths + this.science;
		System.out.println("Total score is : " + result);
		return result;
	}

	public static void main(String[] args) {
		/************************************** StudentOne *******************************************/

		System.out.println("Student One: ");
		StudentSubjectsAverage studentOne = new StudentSubjectsAverage(); // object studentOne created;
		studentOne.marks();
		double studentOneTotalScore = studentOne.totalScore(); // displays total score of student;

		/************************************** StudentTwo *******************************************/

		System.out.println("Student Two:");
		StudentSubjectsAverage studentTwo = new StudentSubjectsAverage();
		studentTwo.marks();
		double studentTwoTotalScore = studentTwo.totalScore();

		/************************************** StudentThree *******************************************/

		System.out.println("Student Three:");
		StudentSubjectsAverage studentThree = new StudentSubjectsAverage();
		studentThree.marks();
		double studentThreeTotalScore = studentThree.totalScore();

		/************************************** Calculating English Total and Average *******************************************/

		double englishTotal = studentOne.english + studentTwo.english
				+ studentThree.english;
		double averageEnglish = englishTotal / 3;

		/************************************** Calculating Maths Total and Average *******************************************/

		double mathsTotal = studentOne.maths + studentTwo.maths
				+ studentThree.maths;
		double averageMaths = mathsTotal / 3;

		/************************************** Calculating Science Total and Average *******************************************/

		double scienceTotal = studentOne.science + studentTwo.science
				+ studentThree.science;
		double averageScience = scienceTotal / 3;

		/************************************** Printing Total and Averages *******************************************/

		System.out.println("English total: " + englishTotal + "and it's average is :" + averageEnglish);
		System.out.println("Maths total: " + mathsTotal + "and it's average is :" + averageMaths);
		System.out.println("Science total: " + scienceTotal+ "and it's average is :" + averageScience);
	}

}
