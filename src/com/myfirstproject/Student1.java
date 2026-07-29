package com.myfirstproject;

public class Student1 {
	void showStudentDetails() {
		System.out.println("student Name = kavya");
		System.out.println("Roll Number = 505 ");
		System.out.println("Branch = cse");
		System.out.println("college Name = kits");
	}
	void payFee(double amount) {
		System.out.println("Payament Details");
	}
	public static void main(String[] args) {
		
		Student1 t2 = new Student1();
		
		t2.showStudentDetails();
		t2.payFee(500000);
		
	}

}
