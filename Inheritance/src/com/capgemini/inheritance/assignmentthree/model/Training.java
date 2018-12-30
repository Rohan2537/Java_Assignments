/**	Training
	id
	subject
	fees

	PublicTraining		         	CorporateTraining
	participants	                      	days
	getOrderValue()	 	       		getOrderValue()	
		(fees * participants)		       (fees * days)

	Implementation Details:
	Training Charges are applied on the basis of training types. If it�s a corporate company, charges are applied on the basis of per day(fees * days). But if it is a public program, charges are applied on the basis of, no. of participants (fees * participants).


	In main()	
	1) Create object of PublicTraining using upcasting with some initial value as subject = Java, fees = 5000 and No. of Participants will be 50.		
	2) Get the cost of the training 
	3) Create object of CorporateTraining using upcasting with some initial valueas subject = Big Data, fees = 35000 and No. of days = 4
	4) Get the cost of the training

 * 
 */

package com.capgemini.inheritance.assignmentthree.model;

/**
 * 
 * @author Rohan Bhosale Training class is an abstract parent class which
 *         consists of private instance variables such as id,subjects, fees and
 *         an abstract method getOrderValue;
 */
public abstract class Training {

	private static int id;
	private String subjects;
	private int fees;
	private int nextId;

	static {
		id = 100;
	}
	{
		id++;
	}

	/**
	 * It is a parametrized constructor of class Training;
	 * 
	 * @param subjects
	 * @param fees
	 */
	public Training(String subjects, int fees) {
		this.subjects = subjects;
		this.fees = fees;
		this.nextId = id;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public static int getId() {
		return id;
	}

	public abstract int getOrderValue();

}
