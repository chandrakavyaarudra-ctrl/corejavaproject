package com.OOpsAbstraction;

public class SavingsAccount extends BankAccountAbs{

	double balance =10000.00;
	
	@Override
	public void deposit(double amount) {
		System.out.println("Your deposit amount is :" +amount);
		balance = balance+amount;
		checkBalance();
	}
	
	@Override
	public void withdraw(double amount) {

		if(amount<=balance) {
			balance=balance-amount;
			checkBalance();
		}else {
			System.out.println("In Sufficient balance : " + balance);
		}
	}

	@Override
	public void checkBalance() {

		System.out.println("The current balance is: " +balance);
	}

	@Override
	public
	void hello() {

		System.out.println("Good morning have a nice day");
	}
	
	

}
