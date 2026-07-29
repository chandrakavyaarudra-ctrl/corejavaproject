package com.myfirstproject;
import java.util.Scanner;
public class Hunderedmethods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hunderedmethods t = new Hunderedmethods();
		t. personaldeatils();
		t.personaldeatilss();
	}
	void personaldeatils() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fullName: ");
		String fullName = sc.nextLine();
		System.out.println("fullName : " + fullName);
		
		
		System.out.println("Enter surname: ");
		String surname = sc.nextLine();
		System.out.println("surname : " + surname);
		
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		System.out.println("age : " + age);
		
		System.out.println("Enter gender: ");
		char gender = sc.next().charAt(0);
		System.out.println("gender: " + gender);
		
		System.out.println("Date of birth: ");
		String dob = sc.next();
		System.out.println("Date of birth: " + dob);
		
	}
	
	void personaldeatilss() {
		Scanner sc = new Scanner(System.in);
		System.out.println("mobileNumber: ");
		double mobileNumber = sc.nextDouble();
		
		System.out.println("Email: ");
		String email = sc.nextLine();
		
		System.out.println("Address: ");
		String address = sc.nextLine();
		
	}

}
