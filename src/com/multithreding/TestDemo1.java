package com.multithreding;

public class TestDemo1 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread());
		TestDemo1 t = new TestDemo1();
		t.hello();
		t.welcome();
		System.out.println("Main method ended");

	}

	void hello() {
		System.out.println("Hello method called");

	}

	void welcome() {
		System.out.println("welcome method called");
	}

}
