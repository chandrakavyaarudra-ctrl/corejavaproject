package com.myfirstproject;

public class Cricketer {
	//initialisation
	static int countryId=91;
	static String countryName="India";
	//static block
	static {
		System.out.println("welcome to jvm programming!");
		System.out.println("welcome to jvm programming!");
	}

	public static void main(String[] args) {
		System.out.println("welcome to India Cricket Team!");
		//accessing the static data directly
		System.out.println(countryId);
		System.out.println(countryName);
		//accessing the static data using class name 
		System.out.println(Cricketer.countryId);
		System.out.println(Cricketer.countryName);
		
	}

}
