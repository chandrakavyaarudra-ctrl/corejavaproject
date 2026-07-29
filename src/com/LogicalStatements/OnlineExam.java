package com.LogicalStatements;

import java.util.Scanner;

public class OnlineExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name : ");
		String name = sc.next();
		
		System.out.println("Enter password : ");
		double password = sc.nextDouble();
		
		System.out.println("Login details : ");
		boolean details = sc.nextBoolean();
		
		System.out.println("Exam time : ");
		int time = sc.nextInt();
		
		System.out.println("internet status : ");
		boolean status = sc.nextBoolean();
		
		System.out.println("webcam status  : ");
		boolean webcam = sc.nextBoolean();
		
		if(time>=10) {
			System.out.println("The exam has started.... ");
			
			if(status) {
				System.out.println("Your internet is connected...");
				
				
				if(webcam) {
					System.out.println("Your Webcam is on....");
					
				}else {
					System.out.println("Your webcam is off...");
				}
			}else {
				System.out.println("Your internet is not connected...");
			}
			
			
		}else {
			System.out.println("Exam not started....");
		}
	}

}
