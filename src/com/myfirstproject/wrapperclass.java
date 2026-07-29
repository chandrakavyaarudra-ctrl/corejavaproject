package com.myfirstproject;

public class wrapperclass {

	public static void main(String[] args) {
		
		//Integer.parseInt
		
		String num = "100";
		int number = Integer.parseInt(num);
		System.out.println("Interger value: " + number);
		
		//Double.parseDouble
		String decimal = "99.99d";
		double value = Double.parseDouble(decimal);
		System.out.println("Double value: " + value);
		
		//Boolean.parseBoolean
		
		String bool = "True";
		Boolean result = Boolean.parseBoolean(bool);
		System.out.println("Boolean value: " + result);
		
		//Character.toString
		
		char ch = 'B';
		String str = Character.toString(ch);
		System.out.println("Character to String: " + str);
	}

}
