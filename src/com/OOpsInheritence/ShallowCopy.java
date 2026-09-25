package com.OOpsInheritence;

class Student1 implements Cloneable {
	int sid;
	String sname;
	Address address;// referenced object type

	@Override

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Student1(int sid, String sname, Address address) {
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

public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address address = new Address("Hyderabad");
		Student1 s1 = new Student1(101, "Kavya", address);

		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);

		System.out.println("-----------------------");

		Student1 s2 = (Student1) s1.clone();
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		System.out.println("-----------------------");

		s2.address.city = "Banglore";

		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
	}

}
