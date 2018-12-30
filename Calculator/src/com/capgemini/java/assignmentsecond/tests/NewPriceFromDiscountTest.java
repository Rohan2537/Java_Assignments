/*	Write a Java assignment statement to calculate a 35% discount on an item�s value stored in the variable newItem,
	store the discount amount in a variable called discount. Then calculate the new price for the item subtracting off the discount, storing the new price in a variable called newItemPrice.*/

package com.capgemini.java.assignmentsecond.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class NewPriceFromDiscountTest {

		@Test
		public void NewPriceAfterGivingDiscountOnItem() {
		NewPriceFromDiscountPrice newPriceFromDiscountPrice = new NewPriceFromDiscountPrice();
		assertEquals(3250, newPriceFromDiscountPrice.calculateDiscount(5000, 35));
	}
		

		@Test
		public void NewPriceAfterGivingDiscount() {
		NewPriceFromDiscountPrice newPriceFromDiscountPrice = new NewPriceFromDiscountPrice();
		assertEquals(6500, newPriceFromDiscountPrice.calculateDiscount(10000, 35));
	}
}
