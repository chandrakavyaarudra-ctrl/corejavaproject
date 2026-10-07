package com.OOpsAbstraction;

public class TestAnimal {

	public static void main(String[] args) {

		// Cannot instantiate the type Animal
		// Animal a= new Animal();
		System.out.println("**********Dog info called************** !");

		// Create an OBJECT of Dog class and stores into a interface Animal is the
		// process of abstraction
		// with the help of Up-Casting

		Animal d = new Dog();
		d.eat();
		d.sound();
		d.walk();
		System.out.println("*********************");
		System.out.println("**********Cat info called************** !");

		Animal c = new Cat();
		c.eat();
		c.walk();
		c.sound();
		System.out.println("*********************");
		System.out.println("**********Monkey info called************** !");

		Animal m=new Monkey();
		m.eat();
		m.sound();
		m.walk();
		System.out.println("*********************");


	}

}
