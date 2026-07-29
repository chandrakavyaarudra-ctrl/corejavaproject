package com.LogicalStatements;
import java.util.Scanner;
public class Nested {
// WAP to check multiple conditions based on the requirements
	public static void main(String[] args) {
		System.out.println("main method started !!");
		System.out.println("Welcome to Vcube Materimonial site !!");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("welcome Mr : " + name);
		
		
		System.out.println("Enter your Assets : ");
		double assets = sc.nextDouble();
		
		System.out.println("Enter your salary : ");
		double salary = sc.nextDouble();
		
		
		if(assets >= 500000000.00 && salary >= 25000000.00 ) {
			System.out.println("okay !! Lets start the discussion !!");
			
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
			
			if(age >= 26 && age <= 28) {
				System.out.println("okay good to go !! ");
				
				System.out.println("Enter your height ");
				float height = sc.nextFloat();
				
				System.out.println("Enter your weight : ");
				double weight = sc.nextDouble();
				
				if((height >= 5.5 && height <= 6.0) && (weight >= 65 && weight <= 75)){
					System.out.println("okay will discuss more ");
					System.out.println("Do you drink or smoke.. ?");
					
					boolean habitStatus = sc.nextBoolean();
					
					if(!habitStatus) {
						System.out.println("okay cool !! will discuss ");
						
						System.out.println("Do you have Sibilings ....");
						boolean sibStatus = sc.nextBoolean();
						
						if(sibStatus) {
							System.out.println("Oh my God ");
						}else {
							System.out.println("Oh nice !! will meet soon!! ");
						}
						
					}else {
						System.out.println("You can leave for the day ");
					}
					
				}else {
					System.out.println("You must need to GYM or You are short or too height !!");
				}
				
			}else {
				System.out.println("Sorry !! your age is not matching with our profile ");
			}
		
		}else {
			System.out.println("You can leave for the day !!");
		}
		
		
	}

}
