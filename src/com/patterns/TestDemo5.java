package com.patterns;

public class TestDemo5 {

	    public static void main(String[] args) {

	        for (int i = 6; i >= 1; i--) {

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