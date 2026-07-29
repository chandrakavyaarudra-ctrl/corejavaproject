package com.LogicalStatements;

import java.util.Scanner;

public class LibraryMembership {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student name : ");
		String name = sc.next();
		
		System.out.println("Enter student id : ");
		int id = sc.nextInt();
		
		System.out.println("membership status : ");
		boolean status = sc.nextBoolean();
		
		System.out.println("Number of books : ");
		int books = sc.nextInt();
		
		if(status) {
			System.out.println("Your membership is active.... ");
			
			if(books < 5) {
				System.out.println("whether the requested book is available...");
			}else {
				System.out.println("Book is not available....");
			}
		}else {
			System.out.println("Your membership is not active....");
		}
		
		
	}

}
