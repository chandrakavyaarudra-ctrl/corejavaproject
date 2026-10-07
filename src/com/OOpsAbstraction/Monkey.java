package com.OOpsAbstraction;

public class Monkey implements Animal {

	@Override
	public void sound() {
		System.out.println("Monkey sounds like ke ke");
	}

	@Override
	public void walk() {
		System.out.println("Monkey can walk and also jumps!! ");
	}

	@Override
	public void eat() {
		System.out.println("Monkey mostly eat bananas!!");
	}

}
