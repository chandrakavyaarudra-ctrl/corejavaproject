package com.operators;
public class ArthmeticOperators {
//BODMAS
	public static void main(String[] args) {
		System.out.println("main method started ");
		
		int a = 97;
		int b = 7;
		double d = 10.5;
		float f = 5.9F;
		
		//Note : string +anything is string only
		System.out.println("sum of the two numbers : " + (d + f));
		System.out.println("Difference two numbers : " + (d-f));
		
		System.out.println("product of two numbers : " + d * f);
		
		System.out.println("Quotient of given numbers : " + a / b);
		
		System.out.println("Reminder of two numbers : " + a % b);
		
		System.out.println(2*5 + 5*2);
		
		System.out.println(10/3 + 15 % 2);
	}

}
