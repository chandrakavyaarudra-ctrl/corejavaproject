package com.inheritanceTypes;

class Test1{
	
	Test1(){
		System.out.println("Test1 constructor called ");
	}
	
	
}
class Test2 extends Test1{
	Test2(){
		System.out.println("Test2 constructor called ");
	}
	
}

class Test3 extends Test2{
	Test3(){
		System.out.println("Test3 constructor called ");
	}
	
	
}

public class TestDemo2 {

	public static void main(String[] args) {
		System.out.println("Main method started ");
		
		Test3 t = new Test3();
		
		System.out.println("Main method ended ");
		
	}

}
