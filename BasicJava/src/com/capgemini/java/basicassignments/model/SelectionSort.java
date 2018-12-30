/*9. Selection sorting in a given  array*/

package com.capgemini.java.basicassignments.model;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String args[]) {
		SelectionSort selection = new SelectionSort();
		int arr[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		selection.sort(arr);
		System.out.println("Sorted array");
		selection.printArray(arr);
	}

	void sort(int arr[]) {
		int arrayLength = arr.length;

		for (int i = 0; i < arrayLength - 1; i++) {

			int minimumValue = i;
			for (int j = i + 1; j < arrayLength; j++)
				if (arr[j] < arr[minimumValue])
					minimumValue = j;

			int temp = arr[minimumValue];
			arr[minimumValue] = arr[i];
			arr[i] = temp;
		}
	}

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
