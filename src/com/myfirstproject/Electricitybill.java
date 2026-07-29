package com.myfirstproject;
import java.util.Scanner;

public class Electricitybill {

	public static void main(String[] args) {
		Electricitybill t1 = new Electricitybill();
		
		t1.calculateBill();
			
		}
	void calculateBill() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customerName :");
		String customerName = sc.nextLine();
		System.out.println("Enter units consumed :");
		int units = sc.nextInt();
		double rate = 5.0;
		double totalBill = units*rate;
		
		System.out.println("Electricity Bill.......");
		System.out.println("customerName :" + customerName);
		System.out.println("units consumed :" + units);
		System.out.println("TotalBill :" + totalBill);
	}

}
