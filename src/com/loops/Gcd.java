package com.loops;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = sc.nextInt();
		System.out.println("Enter second number : ");
		int b = sc.nextInt();
		int x = a;
		int y = b;
		while(y!=0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		int gcd = x;
		int lcm = (a * b)/ gcd;
		System.out.println("GCD (HCF) = " + gcd );
		System.out.println("LCM = " + lcm);
		sc.close();
		
	
	}

}
