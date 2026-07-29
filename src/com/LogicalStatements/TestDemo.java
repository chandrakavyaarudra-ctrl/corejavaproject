package com.LogicalStatements;
import java.util.Scanner;

//WAP to find given name can add to PAN details...?
//the name length should not greater than 15 characters.
public class TestDemo {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name : ");
		String name = sc.nextLine();
		
		if(name.length() > 15) {
			System.out.println("Your name is too lengthy, can you give it as a short name : ");
		}else {
			System.out.println("your name is adding to the PAN details : ");
		}
		System.out.println("main method ended !!");
		
	}

}
