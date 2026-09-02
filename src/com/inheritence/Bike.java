package com.inheritence;

public class Bike extends Vehicle1 {
	int speed = 80;
	@Override
	
	void display() {
		System.out.println("Bike speed " + speed);
	}
	
	

	public static void main(String[] args) {
		Vehicle1 v2 = new Bike();
		v2.display();
		System.out.println("Speed " +v2.speed);
	}

}
