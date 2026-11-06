package com.multithreding;

public class TestDemo3 extends Thread{

	public static void main(String[] args) {

		System.out.println("main method started");
		
		TestDemo3 t=new TestDemo3();
		t.start();
		
		for(int i=0;i<=10;i++) {
			System.out.println("main:" + i);
		}
		System.out.println("main method ended");
	}

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("run : "+i);
		}
	}
}
