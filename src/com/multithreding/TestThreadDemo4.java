package com.multithreding;

public class TestThreadDemo4 implements Runnable {

	public static void main(String[] args) {

		System.out.println("main method started");
		TestThreadDemo4 t = new TestThreadDemo4();
		Thread t1=new Thread(t);
		t1.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("Main : " + i);
		}
		System.out.println("main method ended");
	}

	@Override
	public void run() {

		for (int i = 0; i <= 10; i++) {
			System.out.println("run : " + i);
		}
	}

}
