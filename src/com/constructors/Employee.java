package com.constructors;

public class Employee {
	int Empid;
	String Ename;
	String Department;
	double salary;
	
	Employee(){
		System.out.println("No arg constructor :");
	}
	
	Employee(int Empid,String Ename,String Department,double salary){
		this.Empid=Empid;
		this.Ename=Ename;
		this.Department=Department;
		this.salary=salary;
		
	}
	
	
	void displayDetails() {
		System.out.println("Empid:" + Empid);
		System.out.println("Ename: " + Ename);
		System.out.println("Department : " + Department);
		System.out.println("salary: " + salary);
	}

	public static void main(String[] args) {
		Employee t = new Employee(101,"Sam","EEE",90000.0);
		Employee t1 = new Employee();
		t.displayDetails();
		t1.displayDetails();
		
		
		
	}

}
