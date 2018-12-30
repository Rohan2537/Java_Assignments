/*	
	Create few instances of Car and add them to a collection. Have Car implements Comparable interface and override compareTo() to order them by ascending order of make of the Car. Observe the fact that you need to provide the order criteria in compareTo().
*/

package com.capgemini.basiccollections.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCarComparable {

	@Test
	public void testForCarUsingComparableEquals() {
		CarUsingCompareTo carOne = new CarUsingCompareTo("Maruti Suzuki", "Dzire", 2015, 560000);
		CarUsingCompareTo carTwo = new CarUsingCompareTo("Honda", "City", 2018, 800000);
		CarUsingCompareTo carThree = new CarUsingCompareTo("Renault", "Duster", 2017, 750000);
		CarUsingCompareTo carFour = new CarUsingCompareTo("Renault", "Duster", 2018, 800000);
		
		assertEquals(0,carFour.compareTo(carThree));
	}

	@Test
	public void testForCarUsingComparableNotEquals() {
		CarUsingCompareTo carOne = new CarUsingCompareTo("Maruti Suzuki", "Dzire", 2015, 560000);
		CarUsingCompareTo carTwo = new CarUsingCompareTo("Honda", "City", 2018, 800000);
		CarUsingCompareTo carThree = new CarUsingCompareTo("Renault", "Duster", 2017, 750000);
		CarUsingCompareTo carFour = new CarUsingCompareTo("Renault", "Duster", 2018, 800000);
		
		assertEquals(0,carFour.compareTo(carTwo));
	}
}



