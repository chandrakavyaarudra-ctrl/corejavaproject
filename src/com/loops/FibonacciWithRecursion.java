package com.loops;

import java.util.Scanner;

public class FibonacciWithRecursion {
	static int fibonacci(int n) {
		int n1=0;
		int n2 = 1;
		int n3 = 0;
		
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n= sc.nextInt();
		int result = fibonacci(n);
		System.out.println(n+"th fibnocci number = " + result);
		
	}

}
