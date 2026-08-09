package com.loops;

import java.util.Scanner;
//sum of digits in for loop
public class SumOfDigits1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int sum = 0;
		int r = 0;
		for(;n>0;n=n/10) {
			r = n % 10;
			sum = sum +r;
			System.out.println("sum of all digits : " + sum);
		}
		
	}

}
