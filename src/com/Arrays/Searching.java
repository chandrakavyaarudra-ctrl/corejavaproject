package com.Arrays;

import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter 5 values : ");
		for(int i = 0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println("Enter search element : ");
		int search = sc.nextInt();
		boolean found = false;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==search) {
				System.out.println(search + "is present at index " + i);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println(search + "is not present");
		}
		
	}

}
