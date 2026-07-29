package com.myfirstproject;

public class Bank {
	
	double balance=10000;

	public static void main(String[] args) {
		Bank b = new Bank();
		b.checkBalance();
		double amount = 5000;
		b.deposit(500);
		b.withdrawamount(1000);
	
		
	}
	void checkBalance() {
		System.out.println("The currentBalance: " + balance);
	}
	void deposit(double amount) {
		System.out.println("depositamount: " + amount);
		balance+=amount;
		System.out.println("currentBalance: " + balance);
	
	}
	void withdrawamount(double amount) {
		System.out.println("withdraw amount: " + amount);
		balance-=amount;
		System.out.println("currentBalance: " + balance);
		
		
	}


}

