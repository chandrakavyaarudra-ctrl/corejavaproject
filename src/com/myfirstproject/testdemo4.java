package com.myfirstproject;

public class testdemo4 {
	static{
		System.out.println("static block-1 called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		testdemo4 t1 = new testdemo4();
		System.out.println("main method ended ");
	}
	static{
		System.out.println("static block-3 called ");
	}

	{
		System.out.println("instance block called ");
	}
	static{
		System.out.println("static block-2 called ");
	}

}
