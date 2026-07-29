package com.constructors;

public class BankAccount {
	
	String holderName;
	int accountNumber;
	double balance;
	
	BankAccount(){
		System.out.println("No arg constructor called ");
	}
	
	BankAccount(String holderName,int accountNumber,double balance){
		System.out.println("one arg constructor called ");
		this.holderName=holderName;
		this.accountNumber=accountNumber;
		this.balance=balance;
		System.out.println("************************************");
	}
	//copy constructor
	
	BankAccount(BankAccount b){
		this.holderName=holderName;
		this.accountNumber=accountNumber;
		this.balance=balance;
		
	}
	void deposit(double amount) {
		balance += amount;
	}
	
	
	void bankInfo() {
		System.out.println("************************************");
		System.out.println("holderName :" + holderName);
		System.out.println("accountNumber :" + accountNumber);
		System.out.println("balance :" + balance);
		System.out.println("************************************");
	}

	public static void main(String[] args) {
		
		BankAccount b = new BankAccount("kavya",677886678,9908.00);
		b.bankInfo();
		
		BankAccount b1 = new BankAccount(b);
		b1.deposit(5000);
		
		System.out.println("original account: ");
		b.bankInfo();
		
		System.out.println("copied Account :");
		b1.bankInfo();	
	}

}
