package com.OOps;

public class ATMTest {

	public static void main(String[] args) {
		ATMAccount a1 = new ATMAccount();
		a1.setBalance(20000);
		a1.checkBalance();
		a1.deposite(5000);

		a1.checkBalance();
		a1.withdraw(3000);

		a1.checkBalance();
		a1.withdraw(25000);
	}

}
