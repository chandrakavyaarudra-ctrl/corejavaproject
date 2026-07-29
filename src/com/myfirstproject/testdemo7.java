package com.myfirstproject;

public class testdemo7 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		testdemo7 c1 = new testdemo7();
		testdemo7 c2 = new testdemo7();
		testdemo7 c3 = new testdemo7();
		testdemo7 c4 = new testdemo7();
		testdemo7 c5 = new testdemo7();
		
	//	com.myfirstproject.testdemo7@27716f4
		//27716f4 --> Hexa-decimal Representation of the Hashcode
		System.out.println(c1); //Address of the object
		
		int a = 10;//Decimal
		System.out.println(a);//10
		
		int a1 = 123;//Decimal
		System.out.println(a1);//123
		
		int a2 = 0123;//octal Number : 8
		System.out.println(a2);//83 --> 0 1*8^2+ 2*8^1 +  3*8^0 = 64 + 16 + 3 = 83
		c1=null;// Nullifying the Object
	}

}
