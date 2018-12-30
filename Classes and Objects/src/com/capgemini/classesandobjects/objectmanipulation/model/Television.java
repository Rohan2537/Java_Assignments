/*	
 	Design a Television class, refer below hints for its state and behavior and test it Using JUnit:-
 	state (on/off), 
 	current volume, 
 	current channel, 
 	increase and decrease volume and 
 	change channel
 	turn it on and off.
    Design this class, create an instance, turn on, increase and decrease the volume, change channels..get information about state, volume and channel..finally turn it off.*/


package com.capgemini.classesandobjects.objectmanipulation.model;

public class Television {

	private int currentVolume;
	private int currentChannel;
	private String state;

	public String getState()	//getter for state of television;
	{
		return state;
	}

	public void setState(String state) 	//setter for state of television;
	{
		this.state = state;
	}

	public int getCurrentVolume() 	//getter for current volume;
	{
		return currentVolume;
	}

	public void setCurrentVolume(int currentVolume) 	//setter for current volume;
	{
		this.currentVolume = currentVolume;
	}

	public int getCurrentChannel()	//getter for current channel;
	{
		return currentChannel;
	}

	public void setCurrentChannel(int currentChannel)	//setter for current channel;
	{
		this.currentChannel = currentChannel;
	}

	public int increaseVolume(int numberOfPress)	//method to increase volume of television;
	{
		if(numberOfPress>0)
		return (getCurrentVolume() + numberOfPress);
		return -1;
	}

	public int decreaseVolume(int numberOfPress)	//method to decrease volume of television;
	{
		if(numberOfPress>0)
		return (getCurrentVolume() - numberOfPress);
		return -1;
	}

	public int changeChannel(int numberOfPress) 	//method to change channel of television;
	{
		return (getCurrentChannel() + numberOfPress);
	}

}
