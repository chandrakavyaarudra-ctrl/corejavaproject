package com.constructors;

public class Mobile {
	String brand;
	String model;
	int ram;
	double price;
	Mobile(){
		System.out.println("No arg constructors: ");
	}
	
	Mobile(String brand,String model,int ram,double price){
		this.brand=brand;
		this.model=model;
		this.ram=ram;
		this.price=price;
	}
	
	void displayDetails() {
		System.out.println("brand : " + brand);
		System.out.println("model : " + model);
		System.out.println("ram : " + ram);
		System.out.println("price : " + price);
	}

	public static void main(String[] args) {
		Mobile t = new Mobile();
		Mobile t1 = new Mobile("oneplus","nord",8,670000d);
		t.displayDetails();
		t1.displayDetails();
	}

}
