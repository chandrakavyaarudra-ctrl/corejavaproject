package com.Collections;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {

	public static void main(String[] args) {

		int[] a1 = { 1, 5, 10 };
		int[] a2 = { 1, 4, 10 };
		int[] a3 = { 1, 6, 10 };

		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();
		Set<Integer> s3 = new HashSet<>();

		// Adding first array elements

		for (int i = 0; i < a1.length; i++) {
			s1.add(a1[i]);
		}

		// Adding second array elements
		for (int i = 0; i < a2.length; i++) {
			s2.add(a2[i]);
		}

		// Adding third array elements
		for (int i = 0; i < a3.length; i++) {
			s3.add(a3[i]);
		}
		
		//Finding common elements
		
		s1.retainAll(s2);
		s1.retainAll(s3);
		
		System.out.println(s1);
		

	}

}
