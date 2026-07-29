package com.operators;

public class AssignmentOp {

	public static void main(String[] args) {
		System.out.println("main method started ");
		
		int a = 10;
		int result = 10;
		
		System.out.println(a);
		//result = (int) (result + 4.5);
		result += 4.5;//narrowing
		result -= 3.5;
		
		result *= 2.5;//25
		
		result /= 3.5;
		
		result %= 2.5;
		
	
		System.out.println(result);
	}

}
