package com.inheritanceTypes;

// In java Every class extends object class 
//will consider that Implicit single inheritance
//

	
	// Parent or Super or Base
	class Animal {
		
		void animalInfo() {
			System.out.println("Animal method called ");
		}
		void sound() {
			System.out.println("Every animal can sound ! ");
		}
	}

	// One class extends another class will consider as Single Inheritance
	// Child or sub class or derived class
	class Dog extends Animal {
		
		void dogInfo() {
			System.out.println("Dog method called ");
		}

		@Override
		void sound() {
			System.out.println("Dog sounds like Bow Bow !!");
		}
	}

	// one class extends another class,that another class one more class this flow
	// will consider as Multi-level inheritance
	// Grand child
	class BabyDog extends Dog {
		
		void babyDogInfo() {
			System.out.println("Baby Dog method called ");
		}
		@Override
		void sound() {
			System.out.println("BabyDog sounds like bu bu uff ");
		}

	}
	public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("Main method started from driver class");
		BabyDog bg = new BabyDog();
		bg.animalInfo();
		bg.babyDogInfo();
		bg.dogInfo();
		bg.sound();
		System.out.println(bg.hashCode());
	}

}
