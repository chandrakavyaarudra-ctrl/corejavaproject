package com.multithreding;

public class TestDemo2 extends Thread{

	public static void main(String[] args) {

		TestDemo2 t=new TestDemo2();
		t.start();
		for(int i=0;i<=10;i++) {
			System.out.println("main:" +i);
		}
		System.out.println("main method ended");
		
	}
	
	@Override
	public void run() {
		System.out.println("Hello method started");
		
		for(int i=0;i<=10;i++) {
			System.out.println("Hello : " + i);
		
		}
		System.out.println("Hello method ended");
	}

}
