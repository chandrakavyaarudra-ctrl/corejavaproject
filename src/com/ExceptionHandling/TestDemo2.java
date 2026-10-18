package com.ExceptionHandling;

import java.util.Scanner;

public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("Main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int a = sc.nextInt();

		System.out.println("Enter another number :");
		int b = sc.nextInt();

		try {
			System.out.println("in try");
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("in catch");
			e.printStackTrace();
		}

		System.out.println("Main method ended");
	}

}
