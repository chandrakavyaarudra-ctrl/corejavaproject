package com.constructors;

public class StudentDetails {
	String name;
	 String branch;
	 int rollNumber;
	 
	 StudentDetails(String name,String branch,int rollNumber){
		 this.name = name;
		 this.branch = branch;
		 this.rollNumber=rollNumber;
	 }
	 StudentDetails(StudentDetails m){
		 this.name = m.name;
		 this.branch = m.branch;
		 this.rollNumber=m.rollNumber;
	 }
	 
	 void display() {
		 System.out.println("name: " + name);
		 System.out.println("branch: " + branch);
		 System.out.println("rollNumber: " + rollNumber);
	 }

	public static void main(String[] args) {
		StudentDetails n = new StudentDetails("Kavya","cse" ,103);
		n.display();
		StudentDetails n1 = new StudentDetails(n);
		
	
		
	}

}
