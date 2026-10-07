package com.OOpsAbstraction;


//even though the abstract class does not contain any abstract methods we can keep class as abstract 
//if a normal class contain abstract method the class must be abstract


public abstract  class BankAccountAbs implements BankAccount{
	
	public //concrte method
	
	void welcome1() {
		System.out.println("welcome to vcube banking");
	}
	
	
	//abstract method from abstract class
	public abstract void hello();
	

	@Override
	public void deposite(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void welcome() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loanInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loanROI() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}

}
