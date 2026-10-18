package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collections4 {

	public static void main(String[] args) {
		
		Collection <Integer> c2 = new ArrayList<>();
	//	c2.add(9);
		
		if(c2.isEmpty()) {
			c2.add(45);
			c2.add(55);
			c2.add(5);
			c2.add(10);
		}
		
		System.out.println(c2);
	}

}
