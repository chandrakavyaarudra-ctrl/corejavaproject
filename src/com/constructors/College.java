package com.constructors;

public class College {
	String collegeName;
	String city;
	int numberOfStudents;
	College(){
		this("kits");
		System.out.println("no arg constructor ");
	}
	College(String collegeName){
		this(collegeName,"guntur");
		System.out.println("one arg constructor called : ");
	}
	
	College(String collegeName,String city){
		this(collegeName,city,889);
		System.out.println("two arg constructor called");
	}
	
	College(String collegeName,String city,int numberOfStudents){
		
		this.collegeName=collegeName;
		this.city=city;
		this.numberOfStudents=numberOfStudents;
		
		System.out.println("three arg constructor called");}
	
		void display() {
		System.out.println("Collegenmae:"+collegeName);
		System.out.println("city of clg:"+city);
		System.out.println("numberofstudents:"+numberOfStudents);
	}

	public static void main(String[] args) {
		College c = new College();
		c.display();
		College c1=new College();
		c1.display();
		
		
	}

}
