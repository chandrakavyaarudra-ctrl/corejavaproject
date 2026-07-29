package com.constructors;

class Person{
	int cid;
	int age;
	String name;
	String city;
	Person(){
		System.out.println("no arg constructor called from person ");
	}
	
	
	public Person(int cid, int age, String name, String city) {
		super();
		this.cid = cid;
		this.age = age;
		this.name = name;
		this.city = city;
	}


	public static void main(String[] args) {
		System.out.println("main method started from person");
		
		
	}
	void info() {
		System.out.println("**********************************");
		System.out.println("Customer ID : " + cid);
		System.out.println("Customer Name :" + name);
		System.out.println("Customer Age : " + age);
		System.out.println("Customer city :" + city);
		
	}
}
public class Customer extends Person{
		Customer(){
				System.out.println("main method started from person ");
			}
		
		Customer(int cid, int age, String name, String city){
			super(cid,age,name,city);
			System.out.println("parameterized constructor called");
		}

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.info();
		
		Customer c2 = new Customer(101,22,"Ram","Hyderabad");
		c2.info();
		System.out.println("main method started from customer ");
	}

}
