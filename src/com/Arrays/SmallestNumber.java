package com.Arrays;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter 5 values : ");
		// input
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// Smallest
		int Smallest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < Smallest) { // {52,24,32,45,56
				Smallest = arr[i];// {1,27,37,17,19}
			}
		}
		System.out.println("Smallest = " + Smallest);
	}

}
