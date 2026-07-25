package com.myfirstproject;

public class chocolate {

	public static void main(String[] args) {
		double money=360;
		double cost=18.5;
		double purchased=money/cost;
		double free = purchased/5;
		double total=purchased + free;
		System.out.println("purchased chocolates = " + purchased);
		System.out.println("free chocolates = " + free);
		System.out.println("total chocolates = " + total);
	}

}
