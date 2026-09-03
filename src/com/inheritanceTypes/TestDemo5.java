package com.inheritanceTypes;

class Food{
	void calculatePrice() {
		System.out.println("Food");
	}
}

class Pizza extends Food{
	void calculatePrice() {
		System.out.println("Pizza : 500");
	}
}

class Burger extends Food{
	void calculatePrice() {
		System.out.println("Burger : 80");
	}
}

class Biryani extends Food{
	void calculatePrice() {
		System.out.println("Biryani : 800");
	}
}
public class TestDemo5 {

	public static void main(String[] args) {
	
		Food f = new Food();
		Food f1 = new Pizza();
		Food f2 = new Burger();
		Food f3 = new Biryani();
		
		f.calculatePrice();
		f1.calculatePrice();
		f2.calculatePrice();
		f3.calculatePrice();
	}

}
