package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		
		
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(9);
		l1.add(9);
		l1.add(9);
		//l1.add(null);
		Collections.sort(l1);
		System.out.println(l1);
		

		List l = new ArrayList();
		
		l.add(10);
		l.add("java");
		l.add('A');
		l.add(9.6F);
		System.out.println(l);
		
		
	}

}
