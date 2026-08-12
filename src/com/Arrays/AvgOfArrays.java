package com.Arrays;

import java.util.Scanner;
//average of arrays 

public class AvgOfArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("Enter 5 values : ");
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			sum=sum+arr[i];
		}
		double avg = (double) sum / arr.length;

		System.out.println("Sum = " + sum);
		System.out.println("Avg = " + avg);
	}
	

}
