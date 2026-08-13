package com.Arrays;

import java.util.Scanner;

public class DisariumNumber {
	static boolean isDisarium(int n) {
		int temp = n;
		int sum=0;
		int count = 0;
		int digit = 0;
		
		while(temp>0) {
			count++;
			temp=temp/10;
		}
		while(temp>0) {
			digit = temp % 10;
			sum = sum +(int) Math.powExact(digit, count);
			count--;
			temp = temp / 10;
		}
		return sum == digit;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  a number : ");
		int n = sc.nextInt();
		boolean result = isDisarium(n);
		if(result) {
			System.out.println(n + "is a Disarium Number ");
		}else {
			System.out.println(n + "is not a Disarium Number");
		}

	}

}
