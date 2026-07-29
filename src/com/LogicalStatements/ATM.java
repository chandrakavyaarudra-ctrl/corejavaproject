package com.LogicalStatements;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int correctPin = 1234;
		double balance = 20000;
		double dailyLimit = 10000;
		
		System.out.println("Enter Pin :");
		int pin = sc.nextInt();
		if(pin == correctPin) {
			System.out.println("Enter withdrawel amount : ");
			
			double amount = sc.nextDouble();
			
			if(amount <= dailyLimit) {
				if(amount <= balance) {
					balance =balance - amount;
					System.out.println("withdrawel successfull ");
					System.out.println("Reamaining balance " + balance);
				}else {
					System.out.println("Insufficient balance");
				}
			}else {
				System.out.println("Daily withdrawal Limit Exceeded ");
			}
		}else {
			System.out.println("Inavlid PIN ");
		}
		sc.close();
	}

}
