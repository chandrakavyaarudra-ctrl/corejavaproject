package com.loops;

import java.util.Scanner;

public class PerfectNumber {
	
	static boolean PerfectNumber(int n) {
		int sum = 0;
			for(int i = 1;i <= n/2; i++) {
				if(n%i==0) {
					sum = sum + i;
				}
				
			}
			if(sum==n) {
				return true;
			}
			return false;
			
	}

	public static void main(String[] args) {
		System.out.println("Main method started...");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		boolean status = PerfectNumber(n);
		if(status) {
			System.out.println("The given number is Perfect ");
		}else {
			System.out.println("The given number is not perfect..");
		}
		sc.close();
	}

}
