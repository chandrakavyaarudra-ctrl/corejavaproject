package com.OOpsAbstraction;

//SRS : software requirement specification
//By default interface variables are public static final

//interface methods are public and abstract

public interface Animal {

	public static final String ORG_NAME = "Vcube-PET-Store";

	// Abstract methods do not specify a body
	public abstract void sound();

	public void walk();

	void eat();

	public default void run() {
		System.out.println("Every animal can run !!!");
		hello();
	}

	public default void sleep() {
		System.out.println("Every animal sleep for sure!!");
		hello();
	}

	private void hello() {
		System.out.println("Hello");
		System.out.println("Hello");

		System.out.println("Hello");

		System.out.println("Hello");

		System.out.println("Hello");

	}

}
