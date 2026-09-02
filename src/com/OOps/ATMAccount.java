package com.OOps;

public class ATMAccount {

	private double balance;

	// setter
	public void setBalance(double balance) {
		if (balance >= 0) {
			this.balance = balance;
		}

	}

	// Getter
	public double getBalance() {
		return balance;
	}
	// Deposite

	public void deposite(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Deposite amount must be greater than 0");
		}
	}

	public void withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("withdraw amount must be greater than 0 ");
		} else if (amount > balance) {

			System.out.println("Insufficient balance");

		} else {
			balance = balance - amount;
			System.out.println("Amount withdraw : " + amount);
		}
	}
	// checkbalance

	public void checkBalance() {
		System.out.println("current balance : " + getBalance());
	}
}
