package com.myfirstproject;

public class testdemo5 {
	public static void hello() {
		System.out.println("Hello good morning have a nice day !");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		hello();//calling the method
		testdemo5 t1 = new testdemo5();
		t1.welcome();
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread());
	}
	void welcome() {
		System.out.println("welcome to june!!!... ");
	
	}
	

}
