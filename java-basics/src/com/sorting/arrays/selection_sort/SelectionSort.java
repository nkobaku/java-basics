package com.sorting.arrays.selection_sort;

public class SelectionSort {
	public static void main(String[] args) {
		int[] inputArray = { 5, 9, 3, 1, 7 };
		int length = inputArray.length;
		int minValueIndex;

		System.out.print("Before sorting input array: ");
		printInputArray(inputArray);
		// Outer Loop
		for (int i = 0; i < length; i++) {
			minValueIndex = i;
			// Inner Loop
			for (int j = i; j < length; j++) {

				if (inputArray[minValueIndex] > inputArray[j]) {
					minValueIndex = j;
				}
			}

			int temp = inputArray[minValueIndex];
			inputArray[minValueIndex] = inputArray[i];
			inputArray[i] = temp;
			System.out.print("\nIterate " + i + " : ");
			printInputArray(inputArray);
		}
		System.out.print("\nAfter sorting input array: ");
		printInputArray(inputArray);
	}

	public static void printInputArray(int[] values) {
		for (int value : values) {
			System.out.print(value + " ");
		}
	}
}