package com.OOps;

class Student implements Cloneable {
	int sid;
	String sname;
	Address address;
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	public Student(int sid, String sname, Address address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}

}

class Address {
	String city;

	public Address(String city) {
		super();
		this.city = city;
	}

}

public class TestShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Main method started ");

		Address address = new Address("Banglore");

		Student s1 = new Student(101, "Kavya", address);
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("***************************************");
		
		Student s2 = (Student) s1.clone();
		
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		System.out.println("***************************************");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("***************************************");

		s2.address.city="Hyderbad";
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("-------------------------------------");
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		

	}

}
