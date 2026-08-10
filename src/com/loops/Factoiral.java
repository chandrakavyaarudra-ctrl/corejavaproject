package com.loops;

import java.util.Scanner;

//factorial of a given number using recursion
public class Factoiral {
	
	static int fact(int n) {
		if(n==1) {
			return 1;
		}
		return fact (n-1)*n;
	}

	public static void main(String[] args) {
		
		System.out.println("Main method started...");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int fact = fact(n);

		System.out.println("Factorial of " + n + " is : " + fact);
	}

}
