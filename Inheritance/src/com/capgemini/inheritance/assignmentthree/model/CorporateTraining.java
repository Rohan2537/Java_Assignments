package com.capgemini.inheritance.assignmentthree.model;

/**
 * 
 * @author Rohan Bhosale
 * CorporateTraining class is a subclass of TrainingClass which consists of private field days and an overriding method getOrderValue();
 */
public class CorporateTraining extends Training {
	private int days;

	/**
	 * Parametrized constructor of class CorporateTraining, subclass
	 * fields-subjects,fees;
	 * 
	 * @param subjects
	 * @param fees
	 * @param days
	 */
	public CorporateTraining(String subjects, int fees, int days) {
		super(subjects, fees);
		this.days = days;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	/**
	 * overriding method from parent class Training which returns the order
	 * value of course, i.e (fees*days);
	 */
	@Override
	public int getOrderValue() {

		return super.getFees() * days;
	}

	/**
	 * overriding method from class Object which returns values of various
	 * fields as a String;
	 */
	@Override
	public String toString() {
		return "CorporateTraining [days=" + days + ", getDays()=" + getDays()
				+ ", getOrderValue()=" + getOrderValue() + ", getSubjects()="
				+ getSubjects() + ", getFees()=" + getFees() + "]";
	}

}
