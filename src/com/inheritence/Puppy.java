package com.inheritence;

public class Puppy extends Dog1 {
	
	int age = 2;
	@Override
	
	void sound() {
		System.out.println("Puppy age " + age);
	}

	public static void main(String[] args) {
		Dog1 d1 = new Puppy();
		Animal1 a1 = new Dog1();
		d1.sound();
		a1.sound();
		System.out.println(" age " + d1.age);
		
	}

}
