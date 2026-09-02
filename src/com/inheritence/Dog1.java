package com.inheritence;

public class Dog1 extends Animal1{
	int age =10;
	@Override
	void sound() {
		System.out.println("Dog age " + age);
	}

	public static void main(String[] args) {
		Animal1 a1 = new Dog1();
		
		a1.sound();
		System.out.println("Animal age " + a1.age);
	}

}
