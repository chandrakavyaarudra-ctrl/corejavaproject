package com.LogicalStatements;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		if(age<=5) {
			System.out.println("You are a kid ");
		}else if(age<=12) {
			System.out.println("You are children ");
		}else if(age>=13) {
			System.out.println("Teenage ");
		}else if(age>=20) {
			System.out.println("Young age ");
		}else if(age>=35) {
			System.out.println("Middle age ");
		}else if(age > 60) {
			System.out.println("Old age ");
		}else {
			System.out.println("life");
		}
		
		
	}

}
