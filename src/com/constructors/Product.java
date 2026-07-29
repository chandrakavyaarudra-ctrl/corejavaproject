package com.constructors;

public class Product {
	
	int productId;
	String productName;
	String brand;
	double price;
	int warrenty;
	
	Product(int productId,String productName,String brand,double price,int warrenty){
		this.productId=productId;
		this.productName=productName;
		this.brand=brand;
		this.price=price;
		this.warrenty=warrenty;
	}
	
	Product(Product m){
		this.productId=m.productId;
		this.productName=m.productName;
		this.brand=m.brand;
		this.price=m.price;
		this.warrenty=m.warrenty;
	}
	void display() {
		System.out.println("productId : " + productId);
		System.out.println("productName : " + productName);
		System.out.println("brand : " + brand);
		System.out.println("price : " + price);
		System.out.println("warrenty : " + warrenty);
	}

	public static void main(String[] args) {
		Product n1 = new Product(101,"Galaxy","Samsung",799999,24);
		System.out.println("original product");
		n1.display();
		Product n2 = new Product(n1);
		n2.productId = 102;
		System.out.println("copied product ");
		n2.display();
		

	}

}
