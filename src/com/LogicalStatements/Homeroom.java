package com.LogicalStatements;

import java.util.Scanner;
public class Homeroom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name : ");
		String name = sc.next();
		
		System.out.println("enter a age : ");
		int age = sc.nextInt();
		
		System.out.println("ld proof avaliable : ");
		boolean id = sc.nextBoolean();
		
		System.out.println("no of days");
		int days = sc.nextInt();
		
		System.out.println("advanced payment : ");
		boolean payment = sc.nextBoolean();
		
		System.out.println("room booked");
		String room = sc.next();
		
		if(age>=18&&age<=28) {
			System.out.println("age is eligible");
			if(id){
				System.out.println("your ara eligible for room");
				if(days<=10) {
					System.out.println("no of days");
					if(payment) {
						System.out.println("payment is suceesfully");
						
					}else {
						System.out.println("i am not their in room");
					}
				}else {
					System.out.println("not there");
				}
				
			}else {
				System.out.println("your not eligible because id proof is not their");
			}
		}else {
			System.out.println("the age is not eligible");
		}
		
	

	}

}
