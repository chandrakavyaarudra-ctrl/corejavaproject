package com.constructors;

public class Car {
	String brand;
	String model;
	double price;
	
	Car(){
		System.out.println("No args constructor : ");
		
	}
	
	Car(String brand,String model,double price){
		
		System.out.println("*******Parameterised constructor*********");
		
		
		this.brand=brand;
		this.model = model;
		this.price = price;
	}
	void displayDetails() {
		System.out.println("brand : " + brand);
		System.out.println("model : " + model);
		System.out.println("price : " + price);
	}


	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("Toyato","Fortuner",5000000);
		c1.displayDetails();
	
		c2.displayDetails();
		
	
	}
	
}
