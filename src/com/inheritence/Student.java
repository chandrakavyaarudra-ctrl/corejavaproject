package com.inheritence;

public class Student {
	
	
	String name;
	Address address;
	//Constructor
	
	Student(String name,Address address){
		this.address=address;
		this.name=name;
	}
	//copied object 
	Student (Student s){
		this.name=s.name;
		this.address=new Address(s.address.city);
	}
	
	public static void main(String[] args) {
		
		Address a1 = new Address("Guntur");
		
		Student s1 = new Student("hema",a1);
		Student s2 = new Student(s1);
		
		s1.address.city="Nrt";
		System.out.println("original " + s1.address.city);
		System.out.println("copied " + s2.address.city);
		
	}

}
