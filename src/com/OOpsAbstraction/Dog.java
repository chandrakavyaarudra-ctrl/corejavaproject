package com.OOpsAbstraction;

//Implemented class from Animal interface

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("Dog sounds like Bow bow!!");

	}
	@Override
	public void eat() {
		System.out.println("Dog mostly eats Non-veg !!");
	}
	@Override
	public void walk() {
		System.out.println("Dog can walk and also can run like anything !!");
	}

}
