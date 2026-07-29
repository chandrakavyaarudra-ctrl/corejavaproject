package com.operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		System.out.println("************bitwise And*********");
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		System.out.println(false & false);
		
		System.out.println(1 & 1);
		System.out.println(1 & 0);
		System.out.println(0 & 1);
		System.out.println(0 & 0);
		
		
		System.out.println("************bitwise OR*********");
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | true);
		System.out.println(false | false);
		
		

		System.out.println(1 | 1);
		System.out.println(1 | 0);
		System.out.println(0 | 1);
		System.out.println(0 | 0);
		
		
		System.out.println("************bitwise And*********");
		System.out.println(10 & 20);
		System.out.println(87 & 49);
		System.out.println(92 & 53);
		System.out.println(79 & 27);
		System.out.println("************bitwise OR*********");
		System.out.println(10 | 20);
		System.out.println(87 | 49);
		System.out.println(92 | 53);
		System.out.println(79 | 27);
		
		System.out.println("************bitwise XOR*********");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		

		System.out.println(1 ^ 1);
		System.out.println(1 ^ 0);
		System.out.println(0 ^ 1);
		System.out.println(0 ^ 0);
		
		System.out.println("************bitwise OR*********");
		System.out.println(10 ^ 20);
		System.out.println(87 ^ 49);
		System.out.println(92 ^ 53);
		System.out.println(79 ^ 27);
		
		System.out.println("Bitwise Tilt ~");
		System.out.println(~9);
		System.out.println(~(-78));
		
		
	}

}
