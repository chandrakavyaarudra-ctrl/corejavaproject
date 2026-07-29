package com.myfirstproject;
import java.util.Scanner;
public class Student3 {
	int sid;
	String sname;
	
	//no-arg constructor
	
Student3(){
	System.out.println("no arg constructor called : ");
	this.sid=101;
	this.sname = "chandu";
	System.out.println("Student ID : " + sid);
	System.out.println("Student Name : " + sname);
}


//parameterized constructor

Student3(int sid,String sname){
System.out.println("Parameterized constructor : ");

	this.sid=sid;
	this.sname=sname;
	
}
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		Student3 t1 = new Student3();
		System.out.println("--------------------------");
		Student3 t2 = new Student3(102,"kavya");
		System.out.println("Student ID : " + t2.sid);
		System.out.println("Student Name : " +t2.sname);
	}

}
