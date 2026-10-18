package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collections3 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<>();
		c1.add(10);
	
		c1.add(20);
		System.out.println(c1);
		
		
		Collection<Integer> c2=new ArrayList<>();
		
		c2.add(10);
		c2.add(20);
		
		Collection<String> c3 = new ArrayList<>();
		
		c3.add("A");
		c3.add("B");
		System.out.println(c3);
		
		System.out.println(c3.hashCode());
		
		
		System.out.println(c2);
		
		System.out.println(c1.equals(c2));
		
		System.out.println(c1.hashCode());
		
		System.out.println(c2.hashCode());
	}

}
