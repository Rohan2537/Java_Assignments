/*	
 	Design a Television class, refer below hints for its state and behavior and test it Using JUnit:-
 	state (on/off), 
 	current volume, 
 	current channel, 
 	increase and decrease volume and 
 	change channel
 	turn it on and off.
    Design this class, create an instance, turn on, increase and decrease the volume, change channels..get information about state, volume and channel..finally turn it off.*/

package com.capgemini.classesandobjects.objectmanipulation.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTelevision {
private Television television;
	@Before
	public void setUp()
	{
		television = new Television();		//object of class Television;
	}
	
	@Test
	public void testForTelevisionStateOn()	//test for On state of television; 
	{
		television.setState("on");
		assertEquals("on",television.getState());
	}

	@Test
	public void testForTelevisionStateOff() 	//test for Off state of television;
	{
		television.setState("off");
		assertEquals("off",television.getState());
	}
	
	@Test
	public void testForTelevisionCurrentChannel()    //test for current channel of television;
	{
		television.setCurrentChannel(100);
		assertEquals(100,television.getCurrentChannel());
	}
	
	@Test
	public void testForTelevisionChangeChannelToNextChannel() 	//test for change to next channel of television;
	{
		television.setCurrentChannel(100);
		assertEquals(110,television.changeChannel(10));
	}
	
	@Test
	public void testForTelevisionChangeChannelToPreviousChannel()	//test for change to previous channel of television; 
	{
		television.setCurrentChannel(100);
		assertEquals(90,television.changeChannel(-10));
	}
	
	@Test
	public void testForTelevisionIncreaseVolume() 	//test for increase volume of television;
	{
		television.setCurrentVolume(10);
		assertEquals(12,television.increaseVolume(2));
	}
	
	@Test
	public void testForTelevisionDecreaseVolume() 	//test for decrease volume of television;
	{
		television.setCurrentVolume(10);
		assertEquals(8,television.decreaseVolume(2));
	}
}
