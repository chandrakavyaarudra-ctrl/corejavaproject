package com.myfirstproject;

public class BankManagementSystem {
	
	static int NextAccountNumber=1001;
	
	int AccountNumber;
	String CustomerName;
	long AccountBalance;
	
	
	{
		AccountNumber=NextAccountNumber++;
	}

	void show() {
		System.out.println("AccountNumber" + AccountNumber );
		System.out.println("CustomerName" + CustomerName );
		System.out.println("AccountBalance" + AccountBalance);
		
	}
	public static void main(String[] args) {
		
		BankManagementSystem t1=new BankManagementSystem();
		t1.AccountNumber = 1001;
		t1.CustomerName = "hello";
		t1.AccountBalance = 5778;
		t1.show();
		
		
		BankManagementSystem t2=new BankManagementSystem();
		
		t2.CustomerName="kavya";
		t2.AccountBalance=57989;
		t2.show();
		
		BankManagementSystem t3=new BankManagementSystem();
		
		t3.CustomerName = "hema";
		t3.AccountBalance = 5568;
		t3.show();
		
		
	}

}
