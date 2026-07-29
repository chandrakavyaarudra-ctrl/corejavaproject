package com.LogicalStatements;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		System.out.println("Main method started..");

		Scanner sc = new Scanner(System.in);
		System.out.println("Display day : ");
		int day = sc.nextInt();
		switch(day) {
		
		case 1 -> System.out.println("Sunday (funday)..");
		case 2 -> System.out.println("Monday(lazy day)..");
		case 3 -> System.out.println("Tuesday(routine day)..");
		case 4 -> System.out.println("wednesday(routine day)..");
		case 5 -> System.out.println("thursday(routine day)..");
		case 6 -> System.out.println("friday(weekend day)..");
		case 7 -> System.out.println("saturday(weekend day)..");
		
		default -> System.out.println("Invalid day..");
			
		
		}
		
		
	}

}
