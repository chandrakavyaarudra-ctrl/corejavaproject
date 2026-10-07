package com.OOpsAbstraction;

public class TestBankAccount {

	public static void main(String[] args) {
		System.out.println("Welcome to vcube savings bank account");
		
		//Cannot instantiate the type BankAccount

		//BankAccount b=new BankAccount();
		
		
	//	BankAccountAbs babs = new BankAccountAbs();
		BankAccount sa = new SavingsAccount();
		
	
		sa.deposit(20000.00);
		sa.withdraw(15000);
		sa.hello();
		sa.welcome();
	}

}
