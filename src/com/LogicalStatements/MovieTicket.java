package com.LogicalStatements;

import java.util.Scanner;

public class MovieTicket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = sc.next();
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		System.out.println("valid id : ");
		boolean id = sc.nextBoolean();
		
		System.out.println("seats are available or not : ");
		boolean seat = sc.nextBoolean();
		
		System.out.println("Payment Status : ");
		boolean status = sc.nextBoolean();
		
		if(age >= 18) {
			System.out.println("Your age is valid ");
			
			if(id) {
				System.out.println("your id proof..");
				
				if(status) {
					System.out.println("Payment successfully.....");
					
				}else {
					System.out.println("Insufficent balance....");
				}
			}else {
				System.out.println("Your id proof is not available ");
			}
		}else {
			System.out.println("Your age is not valid ");
		}
	}

}
