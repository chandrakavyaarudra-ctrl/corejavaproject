package com.OOps;

import java.util.Scanner;

public class Loan {
	
	
	static Scanner sc = new Scanner(System.in);

	
	boolean isPhoneVaild() {
		System.out.println("Enter your mobile number ");
		String phone = sc.next();
		return phone.matches("[6-9]{1}[0-9]{9}");
	}

	boolean isAadharValid() {
		System.out.println("Enter your aadhar ");
		String aadhar = sc.next();
		return aadhar.matches("[1-9]{1}[0-9]{11}");
	}

	boolean isPanValid() {
		System.out.println("Enter your Pan");
		String Pan = sc.next();
		return Pan.matches("[A-Z]{5}{4}[A-Z]{1}");
	}

	double getLoanROI() {
		double roi = 8.5;
		int cibil = getcibilScore();
		if (cibil >= 300 && cibil <= 459) {
			System.out
					.println("poor - high risk loan applications are likely to be rejected or approved at high rates");
			roi = roi + 4;
		} else if (cibil >= 550 && cibil <= 699) {
			System.out.println("Fair - Moderate may face limitations in credit approval");
			roi = roi + 2.0;

		} else if (cibil >= 700 && cibil <= 749) {
			System.out.println("Good - Low risk better chances of loan approval with favourable terms");
			roi = roi + 1.5;
		} else if (cibil >= 750 && cibil <= 900) {
			System.out.println(
					"Excellent - very low risk highest likelyhood of apporval and access to lower interest rates ");
			roi = roi = 0.5;
		} else {
			System.out.println("Inavalid cibil information !! can you connect with Relationship manager of your bank ");

			roi = roi + 10.0;
		}

		return roi;

	}

	int getcibilScore() {
		System.out.println("Enter your cibil score ");
		int cibil = sc.nextInt();
		return cibil;
	}

	double getCustomerSalary() {
		System.out.println("Enter your salary : ");
		double salary = sc.nextDouble();
		return salary;
	}

	int getcustomerAge() {
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		return age;
	}


}
