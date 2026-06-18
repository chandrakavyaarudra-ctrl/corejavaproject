package com.myfirstproject;

public class TestDemo1 {
	static TestDemo1 t1=new TestDemo1();
	
	static void Method1(){
		t1.Method2();
		System.out.println("Method1 called");
		}
		
		void Method2(){
		System.out.println("Method2 called");
		Method3();
		}
		
		static void Method3(){
		System.out.println("Method3 called");
		t1.Method4();
		}
		
		void Method4(){
		System.out.println("Method4 called");
		
}
	public static void main(String[] args) {
		System.out.println("main method started");
		Method1();
		
	}

}
