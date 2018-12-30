/*	Add all the names of our class students randomly to a collection, iterate through them and print. Observe that collection is maintaining the order that you add.
	Add all the names of our class students randomly to a collection, iterate through them and print. Observe that collection keeps these elements in a natural order.
*/

package com.capgemini.basiccollections.tests;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class TestStudentNames {

	private StudentNames nameOne = new StudentNames("Rohan");		//objects of class StudentNames;
	private StudentNames nameTwo = new StudentNames("Shubham");
	private StudentNames nameThree = new StudentNames("Tushar");
	private StudentNames nameFour = new StudentNames("Shubham");
	private StudentNames nameFive = new StudentNames("Ankita");
	private StudentNames nameSix = new StudentNames("Deepika");

	@Test
	public void testForNameSequence() {	//List-Duplicates allowed,Ordered;

		List<StudentNames> list = new LinkedList<>();
		list.add(nameOne);
		list.add(nameTwo);
		list.add(nameThree);
		list.add(nameFour);
		list.add(nameFive);
		list.add(nameSix);

		Iterator<StudentNames> counter = list.iterator();
		while (counter.hasNext()) {
			System.out.println(counter.next());
		}

	}

	@Test
	public void testForNaturalSequenceOfNames() {	//TreeSet-Duplicates not allowed,Sorting in ascending order;
		TreeSet<String> list = new TreeSet<String>();
		list.add("Rohan");
		list.add("Shubham");
		list.add("Tushar");
		list.add("Shubham");
		list.add("Ankita");
		list.add("Deepika");

		Iterator<String> iterator = list.iterator(); // Traversing elements;

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	/*	Create a simple map to store all of our class students� names and their favorite fruits. Try to get their favorite fruit by giving their name. Also, list all the names and their favorite fruits saperately.
	 */
	
	@Test
	public void testForStudentsUsingMap() {		// Map-Unordered,Key-Value pair,duplicates not allowed;
		Map<String, String> map = new HashMap();
		map.put("Rohan", "Mango");
		map.put("Shubham B", "Apple");
		map.put("Tushar", "Watermelon");
		map.put("Tejas", "Pineapple");
		map.put("Shubham", "Banana");

		Set set = map.entrySet(); // Traversing Map ;//Converting to Set so that we can traverse
		Iterator itr = set.iterator();
		
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}

