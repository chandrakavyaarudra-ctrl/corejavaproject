package com.constructors;

public class Animal {
	
	Animal(){
		this("unknown");
		System.out.println("Animal defalut constructor");
	}
	Animal(String type){
		System.out.println("parameterized constructor " + type);
	}
}

class mammal extends Animal {
	mammal(){
		this("mammal");
		System.out.println("mammal defalut constructor");
	}
	mammal(String name){
		super("Animal");
		System.out.println("mammal parameterized constructor : " + name);
	}
}

 class Dog extends mammal{
	 Dog(){
		 this("Labrader");
		 System.out.println("Dog parametrized constructor : ");
	 }
	 Dog(String breed){
		 super("Dog");
		 System.out.println("Dog parameterized constructor : " + breed);
	 }

	public static void main(String[] args) {
		Dog d = new Dog();
		
	}

}
