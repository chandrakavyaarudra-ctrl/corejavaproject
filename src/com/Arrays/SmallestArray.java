package com.Arrays;

import java.util.Scanner;

public class SmallestArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		System.out.println("Enter 5 values : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int min = arr[0];
		int secondmin = arr[0];
		
		for(int i = 1;i<arr.length;i++) {
			if(arr[i]<min) {
				secondmin = min;
				min = arr[i];
			}else if (arr[i] < secondmin && arr[i] != min) {
				secondmin=min;
			}
			
		}
		System.out.println("min = " + min);
		System.out.println("secondmin = " + secondmin);
	}

}
