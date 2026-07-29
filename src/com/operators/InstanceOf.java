package com.operators;

class A {

}

class B extends A {

}
public class InstanceOf {


	public static void main(String[] args) {
		System.out.println("main method started ");
		Integer i1 = 10;
		System.out.println(i1 instanceof Integer);
		System.out.println(i1 instanceof Number);
		System.out.println(i1 instanceof Object);
		
		
		//System.out.println(i1 instanceof String);//Incompatible conditional operand types Integer and String
		
		System.out.println(null instanceof Integer);
		
		Number n1 = 100;
		System.out.println(n1 instanceof Integer);
		A a = new A();
		B b = new B();
		
		System.out.println(b instanceof B);
		System.out.println(b instanceof A);
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		
	}

}
