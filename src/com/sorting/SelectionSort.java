package com.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 3, 1, 5, 6, 7, 9, 8 };
		int temp = 0;
		System.out.println("Before Sorting : ");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;

				}
			}

			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.println("After Sorting: ");
		System.out.println(Arrays.toString(arr));
	}

}
