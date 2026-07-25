package com.myfirstproject;

public class javaintroduction {
	//static method
	public static void hello() {
	System.out.println("Good morning!!");
	}
	void display() {
		System.out.println("display your ID card");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		hello();
		
		//object creation
		javaintroduction t1=new javaintroduction();
		t1.display();
		System.out.println("main method ended");
	}
	
	

}
