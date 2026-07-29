package com.LogicalStatements;

public class WithUsingThirdVariable {
//without using third variable
	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A value is : " + a);
		System.out.println("B value is : " + b);
	}

}
