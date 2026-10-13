package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collections2 {


	public static void main(String[] args) {

		Collection<String> boys = new ArrayList<String>();
		Collection<String> girls = new ArrayList<String>();

		boys.add("Raju");
		boys.add("raj");
		boys.add("Sam");
		boys.add("gopal");
		boys.add("krishna");
		System.out.println(boys);
		
		boys.addAll(boys);
		System.out.println(boys);
		
		girls.add("kavya");
		girls.add("hema");
		girls.add("annamani");
		girls.add("Lakshmi");
		System.out.println(girls);
		boys.addAll(girls);
		System.out.println("Combined: " + boys);
		
		
	}

}
