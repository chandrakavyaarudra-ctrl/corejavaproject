package com.LogicalStatements;

import java.util.Scanner;

public class PostiveNumber {

	public static void main(String[] args) {
		System.out.println("main method started : ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("Given number is positive ...");
		}else {
			System.out.println("Given number is not positive...");
		}
		sc.close();

	}
}
