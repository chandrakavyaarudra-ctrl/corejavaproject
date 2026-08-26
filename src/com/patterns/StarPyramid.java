package com.patterns;

public class StarPyramid {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			if (i <= 2) {
				System.out.print("*");
			} else {
				System.out.print("***");
			}
			System.out.println();
		}
	}

}
