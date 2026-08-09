package com.LogicalStatements;

import java.util.Scanner;

public class TestDemoLSDemo {

	static String getGradeDetails(String grade) {
		String gradeDetails = switch (grade) {
		case "A" -> {
			System.out.println("A grade is means more than 90 % ");

			yield "Excellent";		
			}
		case "B" -> {
			System.out.println("B grade is means more than 80 % ");

			yield "Good";		
			}
		case "C" -> {
			System.out.println("C grade is means more than 70 % ");

			yield "avg";		
			}
		default -> "Failed";
		};
		return gradeDetails;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your grade : ");
		String grade = sc.next();
		String details = getGradeDetails(grade);
		System.out.println("Grade Details : " + details);
	}

}
