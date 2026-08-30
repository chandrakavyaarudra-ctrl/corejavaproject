package com.patterns;

public class ATMmain {

	public static void main(String[] args) {
		ATMaccount account = new ATMaccount();
		account.deposite(5000);
		account.checkbalance();
		account.withdraw(2000);
		account.checkbalance();
		account.deposite(5000);
		account.withdraw(-100);
		account.withdraw(0);
		
	}

}
