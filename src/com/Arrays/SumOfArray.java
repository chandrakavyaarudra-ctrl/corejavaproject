package com.Arrays;

import java.util.Scanner;

//WAP sum of integers 

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.print("Enter 5 values : ");
		int sum=0;
		for(int i = 0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}

		System.out.print("sum = " + sum);
	}

}
