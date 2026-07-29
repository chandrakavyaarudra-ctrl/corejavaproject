package com.LogicalStatements;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("main method started..");
		
		System.out.println("Enter a number : ");
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("You are eligible for vote ...");
			
		}else {
			System.out.println("you are not eligible for vote...");
		}
	}

}
