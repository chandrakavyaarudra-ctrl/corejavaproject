package com.Collections;

//This interface imposes a total ordering on the objects of each class that implements it.
public class Laptop implements Comparable<Laptop> {
	String model;
	String brand;
	double price;

	@Override
	public String toString() {
		return "Laptop [model - " + model + ",Brand-" + brand + ",price-" + price +"]";
	}

	public Laptop(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public int compareTo(Laptop o) {
		return this.brand.compareTo(brand);
//		if(this.price<o.price) {
//			return -1;
//		}else if(this.price>o.price){
//			return 1;
//		}else {
//			return 0;
//		}
	}

}
