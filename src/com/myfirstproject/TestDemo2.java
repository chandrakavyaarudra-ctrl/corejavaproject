package com.myfirstproject;
import java.util.Scanner;

public class TestDemo2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		TestDemo2 t1 = new TestDemo2 ();
		double sal = t1.getEmployeeSalary();
		double bonus = t1.getBonus();
		
		
		System.out.println("main method is started ");
		System.out.println("Total salary : " + (sal + bonus));
		System.out.println("main method ended ");
	}
	double getEmployeeSalary() {
		System.out.println("Enter salary : ");
		double salary = sc.nextDouble();
		return salary;
	}
	double getBonus() {
		System.out.println("enter bonus : ");
		double bonus = sc.nextDouble();
		return bonus;
	}

}
