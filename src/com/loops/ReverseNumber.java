package com.loops;

import java.util.Scanner;

public class ReverseNumber {
	static int reverseNumber(int n) {
		int rn = 0;
	while(n > 0) {
		
		int rem=n%10;
		rn = rn * 10 +rem;
		n = n/10;
		
	}
	return rn;
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int reverseNumber = reverseNumber(n);
		System.out.println("reverseNumber " + reverseNumber);
	
		

	}

}
