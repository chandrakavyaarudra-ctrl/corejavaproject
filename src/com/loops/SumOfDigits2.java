package com.loops;

import java.util.Scanner;
//sum of digits in method level
public class SumOfDigits2 {
	static int sumOfDigits(int n) {
		int sum = 0;
		int r=0;
		for(;n>0;n=n/10) {
			r=n%10;
			sum=sum+r;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int result = SumOfDigits2.sumOfDigits(n);
		System.out.println("sum of all digits : " + result);
		sc.close();
	}

}
