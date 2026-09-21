package com.ExceptionHandling;

public class ATM {

	public static void main(String[] args) {
		// withdraw Amount
		try {

			int balance = 5000;
			int withdrawAmount = 6000;

			if (withdrawAmount > balance) {
				throw new ArithmeticException("Insufficient Balance ");
			}
			balance = balance - withdrawAmount;
			System.out.println("withdrwal successful");
			System.out.println("Remaining Balance : " + balance);
		} catch (ArithmeticException e) {
			System.out.println("withdrawal Error:" + e.getMessage());
		}
		// Convert String to double
		try {
			String amount = "5000abc";
			double convertedAmount = Double.parseDouble(amount);
			System.out.println("convertedAmount : " + convertedAmount);

		} catch (NumberFormatException e) {
			System.out.println("Invalid Amount : Enter numbers only");
		}

		// 3. Access Transaction History
		try {
			String[] transactions = { "Deposit : 5000", "Withdraw : 2000", "Deposit : 3000" };

			int index = 5;

			System.out.println("Transaction : " + transactions[index]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Transaction Error : Invalid transaction index");
		}

		// 4. Display Account Details
		try {
			String accountHolder = null;

			System.out.println("Account Holder : " + accountHolder.toUpperCase());

		} catch (NullPointerException e) {
			System.out.println("Account Details Error : Account holder is null");
		}

		// This will execute even if previous operations fail
		System.out.println("ATM Program Completed Successfully");

	}
}
