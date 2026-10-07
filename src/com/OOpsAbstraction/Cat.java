package com.OOpsAbstraction;

public class Cat implements Animal{

	@Override
	public void sound() {
		System.out.println("Cat sounds like mewo mewo !!");
	}

	@Override
	public void walk() {
		System.out.println("Cat walk came from cat only !!");
	}

	@Override
	public void eat() {
		System.out.println("Cat can eat rat!!");
	}

}
