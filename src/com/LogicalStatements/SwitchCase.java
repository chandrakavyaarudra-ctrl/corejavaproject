package com.LogicalStatements;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("Main method started...");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your cricketer jersey Number : ");
		
		int jno = sc.nextInt();
		
		switch(jno) {
		case 7 : 
			System.out.println("Mahendra singh dhoni !!...");
			System.out.println("cool captain....");
			System.out.println("Thala for reason...");
			break;
			
		case 18 :
			System.out.println("Virat kohli !!.....");
			System.out.println("The aggressive cricketer !!.......");
			System.out.println("King kohli....");
			break;
			
		case 45 :
			System.out.println("Rohit sharma!!...");
			System.out.println("The greatest Batsman who has completed 3 doubles....");
			System.out.println("Hitman....");
			break;
			
			default :
				System.out.println("Invalid jersey number !!........");
				System.out.println("Details not found.......");
			
			
		}
				
	}

}
