package com.operators;

public class TestUnaryOperator {

	public static void main(String[] args) {
		int x = 5;
		int y = 7;
		System.out.println(--x);
		System.out.println(x--);
		System.out.println(++x);
		System.out.println(++x);
		System.out.println(--x);
		System.out.println(x--);
		System.out.println(++x);
		System.out.println(x++);
		
		
		System.out.println("******************************");
		
		System.out.println(--y);
		System.out.println(--y);
		System.out.println(y++);
		System.out.println(++y);
		System.out.println(++x);
		System.out.println(--y);
		System.out.println(y--);
		
		System.out.println("******************************");
		
		
		System.out.println(x++ + y++ - y-- + ++x);
		System.out.println(x++ + y++ + y-- - ++x);
		
		
		
		System.out.println("x value is : "  + x);
		System.out.println("y value is : "  + y);
		
		
	}

}
