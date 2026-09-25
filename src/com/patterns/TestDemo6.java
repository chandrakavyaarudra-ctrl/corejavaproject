package com.patterns;

public class TestDemo6 {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			// spaces
			for (int j = 6; j > i; j--) {
				System.out.print(" ");
			}
			// stars

			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 5; i >= 1; i--) {

			// spaces
			for (int j = 6; j > i; j--) {
				System.out.print(" ");
			}

			// stars
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
