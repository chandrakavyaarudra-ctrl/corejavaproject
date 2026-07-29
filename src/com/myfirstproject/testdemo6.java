package com.myfirstproject;

public class testdemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		method1();
	}
	static void method1() {
		testdemo6 t1 = new testdemo6();
		t1.method2();
		System.out.println("method1 called ");
	}
	void method2() {
		System.out.println("method2 called ");
		method4();
	}
	static void method3() {
		System.out.println("method3 called ");
	}
	void method4() {
		System.out.println("method4 called ");
		method3();
	}
	static void method5() {
		System.out.println("method5 called ");
	}
	void method6() {
		System.out.println("method6 called ");
	}
	static void method7() {
		System.out.println("method7 called ");
	}
	void method8() {
		System.out.println("method8 called ");
	}


}
