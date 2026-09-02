package com.inheritence;

public class Car extends Vehicle{
	static int speed=100;
	@Override
	void display() {
		System.out.println("Car speed: " + speed);
	}

	public static void main(String[] args) {
		Vehicle v1 = new Car();
		
		v1.display();
		System.out.println("variable speed " + v1.speed);
		
	}

}
