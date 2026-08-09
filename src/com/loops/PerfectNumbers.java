package com.loops;

import java.util.Scanner;

public class PerfectNumbers {
	static boolean isPerfect(int n) {
		boolean flag = false;
		int sum = 0;
		if(n==1) {
			flag = true;
		}
		for(int i = 1; i <= n/2; i++) {
			if(n % i == 0) {
				sum = sum + i;
			}
			
		}
		
		if(sum==n) {
			flag = true;
		}
		return flag;
	}
	

	public static void main(String[] args) {
		System.out.println("Main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		boolean Status = isPerfect(n);
		if(Status) {
			System.out.println("The given number is perfect ");
		}else {
			System.out.println("The given number is not perfect ");
		}
	}

}
