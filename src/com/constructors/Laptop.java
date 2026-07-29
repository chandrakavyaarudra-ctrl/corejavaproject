package com.constructors;

public class Laptop {
	String brand;
	int ram;
	double price;
	
	Laptop(){
		System.out.println("**********No arg construtor *************");
	}
	
	Laptop(String brand,int ram,double price){
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	Laptop(Laptop n,double increment){
		this.brand = n.brand;
		this.ram =n.ram;
		this.price = n.price+increment;
		
	}
	void displayDetails() {
		System.out.println("brand" + brand);
		System.out.println("ram" + ram);
		System.out.println("price " + price);
	}

	public static void main(String[] args) {
		Laptop l = new Laptop("LENOVO",8,800000.00);
		l.displayDetails();
		Laptop l1 = new Laptop(l,700);
		l1.displayDetails();
		
		
	}

}
