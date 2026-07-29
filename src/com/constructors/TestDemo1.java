package com.constructors;

class vehicle{
	
	String model="Nexon";
	String brand="TATA";
	double price=1500000.00;
	
}

//extends is a keyword to helpful for inheritance
// Inheritance : Getting the parent class functionalities into child class
//IS-A-Relationship
//whenever we  have two classes, the Two classes should provide IS-A relationship,
//then only we can consider that as a Inheritance from java ethics
class Car1 extends vehicle {
	String model="Seltos";
	String brand="KIA";
	double price=1800000.00;
	
	void show()	{
		System.out.println("Show method called : ");
		System.out.println("model of the car : " + super.model);
		System.out.println("brand of the car : " + super.brand);
		System.out.println("price of the car : " + super.price);
	}
	
	void carInfo() {
		System.out.println("model of the car : " + this.model);
		System.out.println("brand of the car : " + this.brand);
		System.out.println("price of the car : " + this.price);
	}
}


//Driver class

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started:");
		
		Car1 c1 = new Car1();
		c1.show();
		c1.carInfo();
		
		System.out.println(c1.model);
		System.out.println(c1.brand);
		System.out.println(c1.price);
		
		System.out.println("main method ended : ");
		
	}

}
