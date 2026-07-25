package com.myfirstproject;

public class datatypes {
	int a;
	float b;
	double c;
	{
		System.out.println("Instance block........");
		a=10;
		b=56f;
		c=45.99;
	}
	
	void add() {
		double result = a+b+c;
		System.out.println("integer " + a);
		System.out.println("float " + b);
		System.out.println("double " + c);
		System.out.println("addtional result " + result);
		
	}

	public static void main(String[] args) {
		datatypes t1=new datatypes();
		t1.add();
		
	}

}
