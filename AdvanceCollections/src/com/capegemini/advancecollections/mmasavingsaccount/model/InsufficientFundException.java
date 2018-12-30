package com.capgemini.advancecollections.mmasavingsaccount.model;

public class InsufficientFundException extends Exception {
	public InsufficientFundException(String message) {
		super(message);
	}
}
