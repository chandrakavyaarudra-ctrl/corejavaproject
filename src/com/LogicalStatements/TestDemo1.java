package com.LogicalStatements;

import java.util.Scanner;
//WAP to print the grade of the student based on his marks
public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks percentage : ");
		double marks = sc.nextDouble();
		
		if(marks > 100 || marks < 0) {
			System.out.println("Invalid marks ");
			
		}else if(marks >= 90) {
			System.out.println("Grade A");
		}else if(marks >= 80) {
			System.out.println("Grade B ");
		}else if(marks >= 70) {
			System.out.println("Grade C ");
		}else if(marks >= 60) {
			System.out.println("Grade D ");
		}else if(marks >= 35) {
			System.out.println("Just Passed ");
		}
		
		else {
			System.out.println("Failed ");
		}
		
	}

}
