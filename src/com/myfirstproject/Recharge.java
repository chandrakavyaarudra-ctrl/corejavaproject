package com.myfirstproject;

public class Recharge {
	void showplanDetails() {
		
		System.out.println("current Rechargeplan");
		System.out.println("planname unlimited 299");
		System.out.println("validity 28 days");
		System.out.println("Data 1.5 GB/Day");
		System.out.println("calls unlimted");
	}

	public static void main(String[] args) {
		Recharge t1 = new Recharge();
		t1.showplanDetails();
		t1.recharge(299);
	}
		void recharge(double amount) {
		System.out.println("Recharge Successful!");
		
	}

}
