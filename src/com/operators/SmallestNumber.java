package com.operators;

public class SmallestNumber {

	public static void main(String[] args) {
		int a = 25;
		int b = 10;
		int c = 27;
		
		int smallest = (a < b) ? ((a < c)?c : a): ((b < c) ? b : c);
		System.out.println("smallestNumber : " + smallest);
	}

}
