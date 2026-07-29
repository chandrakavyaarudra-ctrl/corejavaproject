package com.constructors;

public class TestDemo2 {
	
	String brand;
	String model;
	String color;
	double price;
	
	TestDemo2(){
		this("vcube");
		System.out.println("No arg constructor called ");
		
		brand = "Vcube";
		model = "java";
		color = "blue";
		price = 300000.00;
	}
	
	TestDemo2(String brand){
		this(brand,"java");
		System.out.println("one arg constructor called");
		this.brand=brand;
	}
	
	TestDemo2(String brand, String model){
		this(brand ,model,1200000);
		System.out.println("two arg constructor called");
		this.brand=brand;
		this.model=model;
	}
	
	TestDemo2(String brand, String model,double price){
		System.out.println("three arg constructor called");
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	TestDemo2(String brand, String model,double price,String color){
		this(brand,model,price);
		System.out.println("four arg constructor called");
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.color=color;
	}
		
		
	public static void main(String[] args) {
		System.out.println("Bike main method started ");
		
		TestDemo2 d = new TestDemo2();
		d.bikeInfo();	
		
		TestDemo2 d1 = new TestDemo2("Royal Enfield");
		d1.bikeInfo();

		TestDemo2 d2 = new TestDemo2("yamaha","FZ-S");
		d2.bikeInfo();
		
		TestDemo2 d3 = new TestDemo2("Bajaj","N250",10000000.00);
		d3.bikeInfo();
		
		TestDemo2 d4 = new TestDemo2("glamour","N50",10000000.00,"blue");
		d4.bikeInfo();
		
		System.out.println("Bike main method ended ");
	}
	void bikeInfo() {
		System.out.println("********************************");
		System.out.println("brand of the bike : " + brand);
		System.out.println("model of the bike : " + model);
		System.out.println("color of the bike : " + color);
		System.out.println("price of the bike : " + price);	
		System.out.println("******************************* ");
	}

}
