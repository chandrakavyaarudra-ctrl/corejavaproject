package com.loops;

import java.util.Scanner;

public class Nested2 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Coffee shop ");
		
		System.out.println("Enter Category (hot/cold): ");
		String category = sc.next();
		switch (category) {
		case "hot" -> {
			System.out.println("Enter item (tea/coffee/boost); ");
			String item = sc.next();
		
            switch (item) {

                case "tea" -> System.out.println("Tea costs 20 rs");

                case "coffee" -> System.out.println("Coffee costs 30 rs");

                case "boost" -> System.out.println("Boost costs 40 rs");

                default -> System.out.println("Hot item not available");
            }
        }

        case "cold" -> {

            System.out.print("Enter Item (juice/milkshake/lassi): ");
            String item = sc.next();

            switch (item) {

                case "juice" -> System.out.println("Juice costs 50 rs");

                case "milkshake" -> System.out.println("Milkshake costs 80 rs");

                case "lassi" -> System.out.println("Lassi costs 40 rs");

                default -> System.out.println("Cold item not available");
            }
        }

        default -> System.out.println("Category not available");
    }

    sc.close();
}
}