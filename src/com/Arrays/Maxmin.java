package com.Arrays;

import java.util.Scanner;

public class Maxmin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		System.out.println("Enter 5 values : ");

		// input
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];

			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Minimum = " + min);
		System.out.println("Maximum = " + max);

	}

}
