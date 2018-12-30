package com.capgemini.inheritance.assignmentthree.model;

/**
 * 
 * @author Rohan Bhosale
 * PublicTraining class is a subclass of TrainingClass which consists of private field participants and an overriding method getOrderValue();
 */
public class PublicTraining extends Training {

	private int participants;
	
	public PublicTraining(String subjects, int fees,int participants) {
		super(subjects, fees);
		this.participants = participants; 
	}
	
	/**
	 * overriding method from parent class Training which returns the order
	 * value of course, i.e (fees*days);
	 */
	@Override
	public int getOrderValue(){
		
		return  super.getFees()*participants;
	}

	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}

	/**
	 * overriding method from class Object which returns values of various
	 * fields as a String;
	 */
	@Override
	public String toString() {
		return "PublicTraining [participants=" + participants
				+ ", getOrderValue()=" + getOrderValue() + ", getSubjects()="
				+ getSubjects() + ", getFees()=" + getFees() + "]";
	}
	
	
	
}
