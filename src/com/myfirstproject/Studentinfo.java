package com.myfirstproject;
import java.util.Scanner;

public class Studentinfo {
	//student deatils
	int RollNumber=11;
	String StudentName="kavya";
	int age=22;
	char Gender='F';
	String Section="D";
	
	//student marks
	int sub1=99,sub2=100,sub3=50,sub4=89,sub5=90;
	int total;
	double Percentage=100;
	String passedstatus="passed";
	char Grade='A';
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Studentinfo t1 = new Studentinfo();
		System.out.println(t1.RollNumber);
		System.out.println(t1.StudentName);
		System.out.println(t1.age);
		System.out.println(t1.Gender);
		System.out.println(t1.Section);
		System.out.println("Enter marks of 5 subjects ");
		System.out.println(t1.sub1);
		System.out.println(t1.sub2);
		System.out.println(t1.sub3);
		System.out.println(t1.sub4);
		System.out.println(t1.sub5);
		t1.total = t1.sub1 + t1.sub2 + t1.sub3 + t1.sub4 + t1.sub5;
		System.out.println("Total = " + t1.total);
		System.out.println(t1.Percentage);
		System.out.println(t1.passedstatus);
		System.out.println(t1.Grade);
		
		
	}

}
