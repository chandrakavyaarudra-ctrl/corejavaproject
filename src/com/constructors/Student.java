package com.constructors;

public class Student {
	
	int studentid;
	String studentName;
	String branch;
	float percentage;
	
	Student(){
		System.out.println("No arg constructor: ");
	}

	Student(int studentid,String studentName,String branch,float percentage){
		System.out.println("*******perametarised constructor******");
		this.studentid=studentid;
		this.studentName=studentName;
		this.branch=branch;
		this.percentage=percentage;
		
	}
	void dispalyDetails() {
		System.out.println("studentid : " + studentid);
		System.out.println("studentName : " + studentName);
		System.out.println("branch : " + branch);
		System.out.println("percentage : " + percentage);
	}
	

	public static void main(String[] args) {
		Student t = new Student();
		Student t1 = new Student(102,"Chandu","cse",90);
		t.dispalyDetails();
		t1.dispalyDetails();
	}

}
