package com.OOps;

import java.util.Scanner;

public class PersonalLoanInherietance extends Loan {
	
	void getPerosnalLoanInfo(){
		System.out.println("All the Personal Loan documents Verified Sucessfully !");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method started ");

		System.out.println("Welcome to Vcube Personla Loan Banking !!");

		PersonalLoanInherietance pl = new PersonalLoanInherietance();
		double salary = pl.getCustomerSalary();
		int age = pl.getcustomerAge();
		int cibil = pl.getcibilScore();
		if (salary >= 9000000 && age >= 26 && cibil >= 300 && cibil <= 900) {
			System.out.println("Basic info is validated enter personal details");

			if (pl.isPhoneVaild() && pl.isAadharValid() && pl.isPanValid()) {
				System.out.println("Details are good and Loan got approved ");
				System.out.println("Your Loan ROI is : " + pl.getLoanROI());
				pl.getPerosnalLoanInfo();
			} else {
				System.out.println("Something went wrong ! ");
			}
		} else {
			System.out.println("You are not eligible for personal loan and your loan got rejected");
		}

		System.out.println("Main method ended ");
	}

}
