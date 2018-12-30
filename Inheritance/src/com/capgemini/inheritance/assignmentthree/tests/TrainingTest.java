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

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.inheritance.three.CorporateTraining;
import com.inheritance.three.PublicTraining;
import com.inheritance.three.Training;

public class TrainingTest {

	/**
	 * Test to check the result of PublicTraining without upcasting.Reference type-PublicTraining, Object type-PublicTraining;
	 */
	@Test
	public void testPublicTrainingWithOutUpcasting() 
	{
		PublicTraining userOne = new PublicTraining("Java",5000,50);
		userOne.setParticipants(50);
		int actual = userOne.getOrderValue();
		Assert.assertEquals(250000,actual );
	}

	/**
	 * Test to check the result of CorporateTraining without upcasting;Reference type-CorporateTraining, Object type-CorporateTraining;
	 */
	@Test
	public void testCorporateTrainingWithoutUpcasting() 
	{
		CorporateTraining userTwo = new CorporateTraining("Big Data",35000,4);
		int actual = userTwo.getOrderValue();
		Assert.assertEquals(140000,actual );
	}
	
	/**
	 *  Test to check the result of PublicTraining with upcasting.Reference type-Training, Object type-PublicTraining;
	 */
	@Test
	public void testPublicTrainingWithUpcasting() 
	{
		Training userOne = new PublicTraining("Java",5000,50);
		
		int actual = userOne.getOrderValue();
		Assert.assertEquals(250000,actual );
	}
	
	/**
	 *  Test to check the result of CorporateTraining with upcasting.Reference type-Training, Object type-CorporateTraining;
	 */
	@Test
	public void testCorporateTrainingWithUpcasting() 
	{
		Training userTwo = new CorporateTraining("Big Data",35000,4);
		
		int actual = userTwo.getOrderValue();
		Assert.assertEquals(140000,actual );
	}
}
