package com.LogicalStatements;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		System.out.println("Main method started...");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Display the days : ");
		int day = sc.nextInt();
		switch(day) {
		case 1 :
			System.out.println("sunday..");
			System.out.println("funday");
			break;
		case 2 :
			System.out.println("Monday...");
			System.out.println("lazy day..");
			break;
		case 3 :
			System.out.println("Tuesday..");
			System.out.println("routine day..");
			break;
			
		case 4 :
			System.out.println("Wednesday..");
			System.out.println("routine day..");
			break;
		case 5 :
			System.out.println("Thursday..");
			System.out.println("routine day..");
			break;
		case 6 :
			System.out.println("Friday..");
			System.out.println("weekend day..");
			break;
		case 7 :
			System.out.println("Saturday..");
			System.out.println("weekend day..");
			break;
			default :
				System.out.println("Invalid days... ");
			
		}
	}

}
