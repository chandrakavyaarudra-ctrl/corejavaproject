package com.loops;

import java.util.Scanner;
//WAP to print fibnocci series
public class Fibnocci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.println("How many values you want to print ...?");
		int n = sc.nextInt();
		System.out.print(n1 + " " + n2);
		for (int i = 0; i <= n; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;

		}
	}

}
