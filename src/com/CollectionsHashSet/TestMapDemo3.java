package com.CollectionsHashSet;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

//HashMap is working based on .equals() method
//IdentityHashMap is not working based on == operator
public class TestMapDemo3 {

	public static void main(String[] args) {

		Map<String,String> names = new IdentityHashMap<>();
		
		//string literals
//		String s1="Java";
//		String s2="Java";
		
		//string objects
		
		String s1=new String("J");
		
		System.out.println(System.identityHashCode(s1));
		String s2=new String("J");
		System.out.println(System.identityHashCode(s2));

		
		names.put(s1, "Java is Difficult");
		names.put(s2, "Java is simple");
		System.out.println(names.get(s1));
		
		System.out.println(names);
		
	}

}
