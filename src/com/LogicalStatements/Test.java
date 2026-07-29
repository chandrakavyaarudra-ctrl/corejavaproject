package com.LogicalStatements;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("main method started..");
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
	}

}
