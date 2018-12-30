package com.capgemini.basiccollections.tests;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

public class TestCollections {

	private Laptop laptopOne = new Laptop("Acer", "Aspire", "Windows", "i3");
	private Laptop laptopTwo = new Laptop("Dell", "Idpad300", "Windows", "i5");
	private Laptop laptopThree = new Laptop("Hp", "Pavilion", "Windows", "i3");
	private Laptop laptopFour = new Laptop("Hp", "Pavilion", "Linux", "i5"); // object having duplicate values- can't replicate;

	private Car carOne = new Car("Maruti Suzuki", "Dzire", 2015, 560000);
	private Car carTwo = new Car("Honda", "City", 2018, 800000);
	private Car carThree = new Car("Renault", "Duster", 2017, 750000);
	private Car carFour = new Car("Renault", "Duster", 2018, 800000); // duplicates ;

	private Television televisionOne = new Television("Samsung", "LED", false, 37000);
	private Television televisionTwo = new Television("Sony", "LED", true, 200000);
	private Television televisionThree = new Television("LG", "LED", false, 35000);
	private Television televisionFour = new Television("LG", "LED", true, 35000); // duplicates;

	private Cellphone cellphoneOne = new Cellphone("Iphone", "X", " RAM-3GB, Storage-64GB", "iOS", 80000);
	private Cellphone cellphoneTwo = new Cellphone("Samsung", "Galaxy S8", "RAM-3GB, Storage-64GB", "Android", 50000);
	private Cellphone cellphoneThree = new Cellphone("Nokia", "8.1", "RAM-4GB, Storage-64GB", "Android", 27000);
	private Cellphone cellphoneFour = new Cellphone("Samsung", "Galaxy S8", "RAM-3GB, Storage-32GB", "Android", 40000); // duplicates;

	private School schoolOne = new School("Kendriya Vidhyala", "Pune", "Pune", 3);
	private School schoolTwo = new School("Army School", "Pune", "Pune", 2);
	private School schoolThree = new School("EuroSchool", "Mumbai", "Mumbai", 1);
	private School schoolFour = new School("EuroSchool", "Mumbai", "Mumbai", 5); // duplicates;

	@Test
	public void testForBasicCollections() {		//test using set;

		Set<Laptop> setLaptop = new HashSet();	//for Laptop;
		setLaptop.add(laptopOne);
		setLaptop.add(laptopTwo);
		setLaptop.add(laptopThree);
		setLaptop.add(laptopFour);
		Iterator<Laptop> counter = setLaptop.iterator();
		while (counter.hasNext()) {
			System.out.println(counter.next());
		}

		Set<Car> setCar = new HashSet();	//for Car;
		setCar.add(carOne);
		setCar.add(carTwo);
		setCar.add(carThree);
		setCar.add(carFour);
		Iterator<Car> counterOne = setCar.iterator();
		while (counterOne.hasNext()) {
			System.out.println(counterOne.next());
		}

		Set<Television> setTelevision = new HashSet();	//for Television;
		setTelevision.add(televisionOne);
		setTelevision.add(televisionTwo);
		setTelevision.add(televisionThree);
		setTelevision.add(televisionFour);
		Iterator<Television> counterTwo = setTelevision.iterator();
		while (counterTwo.hasNext()) {
			System.out.println(counterTwo.next());
		}

		Set<Cellphone> setCellphone = new HashSet();	//for Cellphone;
		setCellphone.add(cellphoneOne);
		setCellphone.add(cellphoneTwo);
		setCellphone.add(cellphoneThree);
		setCellphone.add(cellphoneFour);
		Iterator<Cellphone> counterThree = setCellphone.iterator();
		while (counterThree.hasNext()) {
			System.out.println(counterThree.next());
		}

		Set<School> setSchool = new HashSet();	//for School;
		setSchool.add(schoolOne);
		setSchool.add(schoolTwo);
		setSchool.add(schoolThree);
		setSchool.add(schoolFour);

		Iterator<School> counterFour = setSchool.iterator();
		while (counterFour.hasNext()) {
			System.out.println(counterFour.next());
		}

	}
}

