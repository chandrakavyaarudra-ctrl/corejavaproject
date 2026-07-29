package com.myfirstproject;

public class Student2 {
	String getname = "Kavya";
	int getage = 22;
	String getState = "Andhara Pardesh";
	char getGender = 'F';
	String getdob = "27-05-2003"; 
	long getmobileNumber = 9381012516L;
	String getcollegeName = "kits";
	String getBranch = "cse";
	float getPercentage = 90f;
	char getGrade = 'A';
	short getyear = 2026;
	float getHeight = 5.6f;
	double getsalary = 90000d;
	boolean isPassed = true;
	

	public static void main(String[] args) {
		Student2 t = new Student2();
		t.details();
	}
	void details() {
		System.out.println("Name: " + getname);
		System.out.println("age: " + getage);
		System.out.println("State: " + getState);
		System.out.println("Gender: " + getGender);
		System.out.println("dob: " + getdob);
		System.out.println("mobileNumber: " + getmobileNumber);
		System.out.println("collegeName: " + getcollegeName);
		System.out.println("Branch: " + getBranch);
		System.out.println("Percentage: " + getPercentage);
		System.out.println("Grade: " + getGrade);
		System.out.println("year: " + getyear);
		System.out.println("Height: " + getHeight);
		System.out.println("salary: " + getsalary);
	}

}
