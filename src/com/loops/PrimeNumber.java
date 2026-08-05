package com.loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();
		 boolean isPrimeNumber = true;
		
		  if (num <= 1) {
	            isPrimeNumber = false;
	        } else {
	            for (int i = 2; i <= num / 2; i++) {
	                if (num % i == 0) {
	                    isPrimeNumber = false;
	                    break;
	                }
	            }
	        }

	        if (isPrimeNumber) {
	            System.out.println(num + " is a Prime Number");
	        } else {
	            System.out.println(num + " is Not a Prime Number");
	        }

	        sc.close();
	}

}
