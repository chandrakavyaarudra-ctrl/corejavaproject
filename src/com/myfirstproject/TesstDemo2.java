package com.myfirstproject;

public class TesstDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		TesstDemo2 t=new TesstDemo2();
		t.method2();
		
	}
	void method1() {
		System.out.println("Method1 called");
	}
	void method2() {
		System.out.println("Method2 called");
		method1();
	}

}
