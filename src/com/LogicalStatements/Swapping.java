package com.LogicalStatements;

public class Swapping {

	public static void main(String[] args) {
		
		System.out.println("main method started ");
		int a = 10;
		int b = 20;
		int temp = 0;
		
		temp = a;
		a=b;
		b=temp;
		
		System.out.println("A value is : " + a);
		System.out.println("B value is : " + b);
	}

}
