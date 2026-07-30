package com.LogicalStatements;

import java.util.Scanner;

public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started..");
		String yn = " ";
		do {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a first number : ");
		double a = sc.nextDouble();
		System.out.println("Enter a second number : ");
		double b = sc.nextDouble();
		
		System.out.println("Enter a symbol to proceed like + - * / %");
		String symb = sc.next();
		double result = 0;
		switch(symb) {
		case "+" -> result = a + b;
		case "-" -> result = a - b;
		case "*" -> result = a * b;
		case "/" -> result = a / b;
		case "%" -> result = a % b;
		default -> {
			result = 0;
			System.out.println("Invalid symbol to proceed!! ");
		}
		
		}
		System.out.println("Result is " + result);
		System.out.println("Do you want to continue ...? click y for yes N for Exit");
		yn = sc.next();
	}while(yn.equalsIgnoreCase("y"));
		
	System.out.println("Exit!!!");
	}
}
