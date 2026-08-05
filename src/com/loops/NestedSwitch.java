package com.loops;

import java.util.Scanner;

//WAP to create vegetables or fruit market related console based app.
public class NestedSwitch {

	public static void main(String[] args) {
		System.out.println("Vcube Vegetable / Fruit Market ");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Category : ");
		String catg = sc.next();
		
		String yn1 = "";
		switch(catg) {
		case "veg" -> {
			do {
				
			System.out.println("Enter the item : ");
			String item = sc.next();
			switch(item) {
			case "tmt" -> System.out.println("Tomato and the price is 50 rs per kg");
			case "pto" -> System.out.println("potato and the price is 50 rs per kg");
			case "oni" -> System.out.println("Onion and the price is 40 rs per kg");
			case "pot" -> System.out.println("Potato and the price is 30 rs per kg");
			case "car" -> System.out.println("Carrot and the price is 60 rs per kg");
			case "cab" -> System.out.println("Cabbage and the price is 35 rs per kg");
			default -> System.out.println("Vegetable not available");
			
			}
			System.out.println("Do you want to continue with items : Click y for N for yes Nfor no ");
			yn1 = sc.next();
			}while(yn1.equalsIgnoreCase(yn1));
			
		}
		case "fruits" -> {
			do {
				System.out.println("Enter the fruit : ");
				String fruit = sc.next();
				switch(fruit) {
				 case "apple" -> System.out.println("Apple costs 150 rs per kg");
				    case "banana" -> System.out.println("Banana costs 60 rs per dozen");
				    case "mango" -> System.out.println("Mango costs 120 rs per kg");
				    case "orange" -> System.out.println("Orange costs 80 rs per kg");
				    case "grapes" -> System.out.println("Grapes cost 100 rs per kg");
				    case "pineapple" -> System.out.println("Pineapple costs 90 rs each");

				    case "watermelon" -> System.out.println("Watermelon costs 40 rs each");

				    case "papaya" -> System.out.println("Papaya costs 50 rs each");

				    case "guava" -> System.out.println("Guava costs 70 rs per kg");

				    case "pomegranate" -> System.out.println("Pomegranate costs 180 rs per kg");

				    case "kiwi" -> System.out.println("Kiwi costs 30 rs each");

				    case "strawberry" -> System.out.println("Strawberry costs 250 rs per kg");

				    case "dragonfruit" -> System.out.println("Dragon Fruit costs 120 rs each");

				    case "muskmelon" -> System.out.println("Muskmelon costs 60 rs each");

				    case "pear" -> System.out.println("Pear costs 140 rs per kg");

				    case "cherry" -> System.out.println("Cherry costs 350 rs per kg");

				    case "custardapple" -> System.out.println("Custard Apple costs 80 rs each");


				    default -> System.out.println("Fruit not available");
				
				}
				System.out.println("Do you want to continue with items : Click y for N for yes Nfor no ");
				yn1 = sc.next();
			}while(yn1.equalsIgnoreCase(yn1));
			
		}
		default -> System.out.println("The entered Category is not available !");
		}
	}

}
