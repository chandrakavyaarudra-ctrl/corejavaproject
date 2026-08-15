package com.Arrays;

import java.util.Scanner;

public class DuplicateValues1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					System.out.println("Duplicate number are : " + arr[i]);
					
				}
			}
		}
	}

}
