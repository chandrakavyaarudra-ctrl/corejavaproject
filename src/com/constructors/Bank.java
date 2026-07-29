package com.constructors;

public class Bank {
	long accountNumber;
	String customerName;
	String accountType;
	String branchName;
	String ifscCode;
	double balance;
	long mobileNumber;
	String email;
	String city;

	Bank(){
		System.out.println("**********No arg constructor**********");
	}
	
	Bank(long accountNumber,String customerName,String accountType,String branchName,String ifscCode,double balannce,long mobileNumber,String email,String city){
		this.accountNumber=accountNumber;
		this.customerName=customerName;
		this.accountType=accountType;
		this.branchName=branchName;
		this.ifscCode=ifscCode;
		this.balance = 250000;
		this.mobileNumber=mobileNumber;
		this.email=email;
		this.city=city;
	}
	void displayDetails() {
		System.out.println("accountNumber : " + accountNumber);
		System.out.println("customerName : " + customerName);
		System.out.println("accountType : " + accountType);
		System.out.println("ifscCode :" + ifscCode);
		System.out.println("balance : " + balance);
		System.out.println("mobileNumber :" + mobileNumber);
		System.out.println("email : " + email);
		System.out.println("city : " + city);
	}

	public static void main(String[] args) {
		Bank b = new Bank(1233456787989L,"Chandra Kavya","savings","SBI","SBIN00123",25000,9014208606L,"chandu@gmail.com","guntur");
		Bank b1 = new Bank();
		b.displayDetails();
		b1.displayDetails();
		
	}

}
