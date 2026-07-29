package com.operators;

public class LogicalOperator {

	public static void main(String[] args) {
		
		//Logical operators
		int a = 10;
		int b = 20;
		int c = 15;
		System.out.println("************Logical && operator***********************");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("**************************Logical || operators****************************");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
	
		System.out.println("**************************Logical XOR  operator****************************");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		
		System.out.println("**************************");
		System.out.println(a < b && b > c);
		System.out.println(a < b && b < c);
		System.out.println(a > c && b > c);
		System.out.println(a > b && b < c);
		
		
		}

}
