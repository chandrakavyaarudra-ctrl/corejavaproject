package com.loops;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("Main method started ...");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int count=0;
		for (int i=1;i<100;i++) {
			if(i%2==1) {
				count++;
			}
			if(count==n) {
				System.out.println("odd " + i);
				break;
			}
		}
		
	}

}
