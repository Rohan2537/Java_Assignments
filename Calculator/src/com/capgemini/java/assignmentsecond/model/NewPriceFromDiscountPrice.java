/*	Write a Java assignment statement to calculate a 35% discount on an item�s value stored in the variable newItem,
	store the discount amount in a variable called discount. Then calculate the new price for the item subtracting off the discount, storing the new price in a variable called newItemPrice.*/

package com.capgemini.java.assignmentsecond.model;

public class NewPriceFromDiscountPrice {

	public int calculateDiscount(int newItem ,int discountPercentage){
	
		int discount = (newItem *discountPercentage/100);
		int newItemPrice = newItem - discount;
		
		return newItemPrice;
		
	}
}
