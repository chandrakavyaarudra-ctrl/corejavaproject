package com.myfirstproject;

public class Demo {
	public static void method1() {
	System.out.println("method1");
    method2();

	}
    public static void method2() {
    	System.out.println("method2");
    	method3();
    }
    public static void method3() {
    	System.out.println("method3");
    }
    
    
	public static void main(String[] args) {
		method1();
		
		Demo t1=new Demo();
		t1.method4();
		
	}
	void method4() {
		System.out.println("method4");
		method5();
	}
	void method5() {
		System.out.println("method5");
		method6();
	}
	void method6() {
		System.out.println("method6");
	}

}
