package com.myfirstproject;

public class testdemo3 {
	//Declaration
	//static variables
	//intialization
	static int countryId=91;
	static String countryName="India";
	
	int jerseyNo;
	String cricterName;
	//static block
	static{
		System.out.println("Welcome to java program");
	}
	

	public static void main(String[] args) {
		System.out.println("Welcome to Indian cricket Team !");
		//Accessing the static data directly
		System.out.println(countryId);//0 -->91
		System.out.println(countryName);//null -->India
		
		testdemo3 msd = new testdemo3();
		
		System.out.println(msd.jerseyNo);
		System.out.println(msd.cricterName);
		//Accessing the static data using class name
		System.out.println(testdemo3.countryId);
		System.out.println(testdemo3.countryName);
	}

}
