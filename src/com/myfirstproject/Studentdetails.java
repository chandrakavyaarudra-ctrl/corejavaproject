package com.myfirstproject;

public class Studentdetails {
	void showStudentdetails() {
		System.out.println("student name = hema");
		System.out.println("branch=cse");
		System.out.println("roll no: = 1233");
		
	}
	void payfee(double amount) {
		System.out.println("payment details");
	}

	public static void main(String[] args) {
		Studentdetails t1 = new Studentdetails();
		t1.showStudentdetails();
		t1.payfee(50000);


	}

}
