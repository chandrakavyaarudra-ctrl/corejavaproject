package com.myfirstproject;

public class identifiers {
	int id_1;
	String name1;
	void method$1() {
		System.out.println("method1 called ");
	}


	public static void main(String[] args) {
		System.out.println("main method started ");
		identifiers t1 = new identifiers();
		System.out.println(t1.id_1);
		System.out.println(t1.name1);
		t1.method$1();
		
	}
	
}
