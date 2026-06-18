package com.myfirstproject;

public class Employee {
	//initialization
	int Empid;
	String Ename;
	int Salary;
	String Dept;

	public static void main(String[] args) {
		System.out.println("Good morning");
		
		
	
		//object creation
		Employee E1=new Employee();
		E1.Empid=87;
		E1.Ename="kavya";
		E1.Salary=30000;
		E1.Dept="Cse";
		
		
//		System.out.println(E1.Empid);
//		System.out.println(E1.Ename);
//		System.out.println(E1.Salary);
//		System.out.println(E1.Dept);
//		
		Employee E2=new Employee();
		
		E2.Empid=80;
		E2.Ename="Sam";
		E1.Salary=39000;
		E1.Dept="EEE";
		

		System.out.println(E1.Empid);
		System.out.println(E1.Ename);
		System.out.println(E1.Salary);
		System.out.println(E1.Dept);
		
	}

}
