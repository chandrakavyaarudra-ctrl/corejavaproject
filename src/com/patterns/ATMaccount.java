package com.patterns;

public class ATMaccount {
	private double balance;
	public void deposite(double amount) {
		if(amount>0) {
			balance = balance+amount;
			System.out.println("Amount deposited : " + amount);
		}else {
			System.out.println("Deposite amount must be greater than 0");
		}
	}
	
	//withdraw method
	public void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("Withdraw amount must be gretaer than 0");
			
		}else if(amount > balance) {
			System.out.println("Insufficent balance");
		}else {
			balance=balance-amount;
			System.out.println("Amount withdrawn: " + amount);
		}
	}
	
	//check balance
	public void checkbalance() {
		System.out.println("Current balance : "+ balance);
	}

}
