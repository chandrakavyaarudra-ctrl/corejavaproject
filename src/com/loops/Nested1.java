package com.loops;

import java.util.Scanner;

public class Nested1 {

	public static void main(String[] args) {
		System.out.println("Main method started ..");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Category : ");
		String catg = sc.next();
		
		String yn1 = "";
		switch(catg){
		case "Non Veg" -> {
			do {
				System.out.println("Enter your item : ");
				String item = sc.next();
				
			switch(catg) {
		    case "cb" -> System.out.println("Chicken Biryani and the price is 250 rs");
		    case "cc" -> System.out.println("Chicken Curry and the price is 220 rs");
		    case "cf" -> System.out.println("Chicken Fry and the price is 180 rs");
		    case "c65" -> System.out.println("Chicken 65 and the price is 200 rs");
		    case "mb" -> System.out.println("Mutton Biryani and the price is 320 rs");
		    case "mc" -> System.out.println("Mutton Curry and the price is 300 rs");
		    case "ff" -> System.out.println("Fish Fry and the price is 280 rs");
		    case "fc" -> System.out.println("Fish Curry and the price is 260 rs");
		    case "pc" -> System.out.println("Prawn Curry and the price is 350 rs");
		    case "ec" -> System.out.println("Egg Curry and the price is 120 rs");
		    case "om" -> System.out.println("Omelette and the price is 60 rs");
		    case "be" -> System.out.println("Boiled Egg and the price is 20 rs");
		    default -> System.out.println("Non-Veg item not available");
			}
		    System.out.println("Do you want to continue with items : Click y for N for yes Nfor no ");
			yn1 = sc.next();
			}while(yn1.equalsIgnoreCase(yn1));
			
		}
			case "snacks"->{
				
				do {
					System.out.println("Enter your item : ");
					String snacks = sc.next();
					
					switch(snacks) {
				    case "chi" -> System.out.println("Chips and the price is 20 rs");
				    case "bis" -> System.out.println("Biscuits and the price is 30 rs");
				    case "cho" -> System.out.println("Chocolate and the price is 50 rs");
				    case "pop" -> System.out.println("Popcorn and the price is 60 rs");
				    case "cak" -> System.out.println("Cake and the price is 80 rs");
				    case "kur" -> System.out.println("Kurkure and the price is 20 rs");
				    case "nam" -> System.out.println("Namkeen and the price is 40 rs");
				    case "mix" -> System.out.println("Mixture and the price is 50 rs");
				    case "coo" -> System.out.println("Cookies and the price is 70 rs");
				    case "don" -> System.out.println("Donut and the price is 90 rs");
				    default -> System.out.println("Snack item not available");
					}
				    yn1 = sc.next();
					}while(yn1.equalsIgnoreCase(yn1));
				}
				}
		}
}

