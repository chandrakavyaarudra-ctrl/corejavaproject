package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class RetainAllCollections {

	public static void main(String[] args) {
		
		Collection <String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Pineapple");
		fruits.add("Watermelon");
		fruits.add("Papaya");
		fruits.add("Strawberry");
		fruits.add("Guava");
		fruits.add("Pomegranate");
		fruits.add("Kiwi");
		fruits.add("Peach");
		fruits.add("Cherry");
		fruits.add("Jackfruit");
		fruits.add("Muskmelon");
		
		Collection <String> vegetables=new ArrayList<>();
		vegetables.add("potato");
		
		vegetables.add("Tomato");
		vegetables.add("Onion");
		vegetables.add("Carrot");
		vegetables.add("Brinjal");
		vegetables.add("Cabbage");
		vegetables.add("Cauliflower");
		vegetables.add("Spinach");
		vegetables.add("Cucumber");
		vegetables.add("Beans");
		vegetables.add("Beetroot");
		vegetables.add("Radish");
		vegetables.add("Lady Finger");
		vegetables.add("Green Chilli");
		vegetables.add("Pumpkin");
		vegetables.add("Bottle Gourd");
		vegetables.add("Bitter Gourd");
		vegetables.add("Drumstick");
		vegetables.add("Capsicum");
		vegetables.add("Peas");
		vegetables.add("Sweet Potato");
		vegetables.add("Banana");
		
		fruits.retainAll(vegetables);
		
		System.out.println(fruits);
	}

}
