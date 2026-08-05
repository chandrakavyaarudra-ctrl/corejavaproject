package com.loops;

import java.util.Scanner;

public class TestDemo {
	static String getGradeDetails(String grade) {
		String gradeDetails = switch (grade) {
		case "A" -> {
			System.out.println("A grade means more than 90%");
		yield "Excellent";
		}
		case "B" -> {
			System.out.println("B grade means more than 80%");
			yield "Good";
			}
		case "C" -> {
			System.out.println("C grade means more than 70%");
			yield "avg";
		
			}
		case "D" -> {
			System.out.println("D grade means more than 50%");
			yield "ok";
		
			}
		case "E" -> {
			System.out.println("E grade means more than 40%");
			yield "passed";
		
			}
		
		default -> "Failed";
		};
		return gradeDetails;
	}

	public static void main(String[] args) {
		System.out.println("Main method started..");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your grade : ");
		String grade = sc.next();
		
		String details = getGradeDetails(grade);
		System.out.println("Grade Details : " + details);
	}

}
 