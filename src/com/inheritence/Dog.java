package com.inheritence;

public class Dog extends Animal {
	
     int age=10;
	@Override
	void sound() {
		System.out.println("Dog age " + age);
	}

	public static void main(String[] args) {
		
		Animal a1 = new Dog();
		a1.sound();
		System.out.println("age " + a1.age);
	}

}
