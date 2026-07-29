package com.LogicalStatements;

import java.util.Scanner;

public class MobileRecharge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double walletBalance = 500;
	
		System.out.println("Enter Recharge Amount");
		double rechargeAmount = sc.nextDouble();
		
		if(rechargeAmount == 199 || rechargeAmount == 299 || rechargeAmount == 399) {
			if(walletBalance >= rechargeAmount) {
				walletBalance = walletBalance - rechargeAmount;
				
				System.out.println("Recharge Successfull...");
				System.out.println("Remaining wallet Balance  " + walletBalance);
			}else {
				System.out.println("Insufficient balance ...");
				
			}
		
		}else {
			
			System.out.println("Invalid Recharge Plan");
		}
		sc.close();
		
	}

}
