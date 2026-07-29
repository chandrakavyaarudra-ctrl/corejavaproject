package com.constructors;

public class CollegeDetails {
	String collegeName;
	String location;
	int numberOfStudents;
	
	CollegeDetails(String collegeName,String location,int numberOfStudents){
		System.out.println("*****parameterised constructor **********");
		this.collegeName=collegeName;
		this.location=location;
		this.numberOfStudents=numberOfStudents;
	}
	CollegeDetails(CollegeDetails m){
		this.collegeName=m.collegeName;
		this.location=m.location;
		this.numberOfStudents=m.numberOfStudents;
	}
	
	void display() {
		System.out.println("collegeName : " + collegeName);
		System.out.println("location : " + location);
		System.out.println("numberOfStudents : " + numberOfStudents);
	}

	public static void main(String[] args) {
		CollegeDetails n = new CollegeDetails("kits","Guntur",101);
		n.display();
		CollegeDetails n1 = new CollegeDetails(n);
		
	}

}
