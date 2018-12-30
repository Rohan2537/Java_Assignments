/* 10)	From given array of integers, create new array having duplicates removed
 * 		and every element appearing once only from the given array.*/

package com.capgemini.java.basicassignments.model;

import java.util.HashMap;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int arr[] = { 5, 10, 15, 5, 10, 20, 25, 10, 5, 30, 35 };
		HashMap<Integer, Integer> hash = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (hash.containsKey(arr[i])) {
				hash.put(arr[i], hash.get(arr[i]));
			} else {
				hash.put(arr[i], 1);
			}
		}
		System.out.println(hash.keySet());

	}
}
