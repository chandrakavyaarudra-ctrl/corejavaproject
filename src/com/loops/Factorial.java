package com.loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int fact = findFactorial(n);
		System.out.println("Factorial of a given number r : " + fact);
		sc.close();
	}
	private static int findFactorial(int n) {
		int fact = 1;
		for(int i = 1; i <= n; i++) {
			fact = fact * i;
			
		}
		return fact;
		
	}

}
