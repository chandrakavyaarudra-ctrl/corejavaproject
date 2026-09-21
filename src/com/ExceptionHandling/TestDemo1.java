package com.ExceptionHandling;

import java.util.Scanner;

public class TestDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			// Taking two numbers as a string
			System.out.println("Enter first number : ");
			String str1 = sc.next();

			System.out.println("Enter second number : ");
			String str2 = sc.next();

			// Converting Strings into integers
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);

			// Dividing first number into second number

			int result = num1 / num2;

			System.out.println("Division Result " + result);

			// creating an integer array

			int[] arr = { 10, 20, 30, 40, 50 };

			System.out.println("Enter an array index : ");

			int index = sc.nextInt();
			System.out.println("Array Element " + arr[index]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid array index ");
		}

		catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		} catch (NumberFormatException e) {
			System.out.println("Invalid number ! Please enter numbers only.");
		}
		sc.close();

	}

}
