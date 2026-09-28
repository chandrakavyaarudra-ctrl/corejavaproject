package com.OOpsPolymorphisms;

public class TestDemo {

	public static void main(String[] args) {
		
		System.out.println("Main method started ");
		Integer i1 =10;
		
		System.out.println(i1); //auto unboxing
		TestDemo t = new TestDemo();
		System.out.println(t);//object
		
		byte b=10;
		System.out.println(b);//auto promotion
		
		
		System.out.println(100);//int 
		System.out.println(100L);//Long
		System.out.println(5.9F);//float

		System.out.println(756.67456D);//double
		
		System.out.println('A');
		System.out.println(false);


		char[] ch= {'A','P','P'};
		System.out.println(ch);
		
	}

}
