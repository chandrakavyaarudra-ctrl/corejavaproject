package com.OOpsPolymorphisms;

public class TestDemo2 {

	void main(String[] args) {
		System.out.println("Main method started ");
		hello("Kavya");
		//hello(null);
	}

	void hello(Integer name) {
		System.out.println("Hello starting method called : " + name);
	}

//	void hello(String name) {
//		System.out.println("Hello starting method called : " + name);
//	}

	void hello(Object obj) {
		System.out.println("hello object method called :" + obj);
	}

}
