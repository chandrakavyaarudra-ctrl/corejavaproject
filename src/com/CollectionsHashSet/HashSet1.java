package com.CollectionsHashSet;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 3, 4, 5, 6, 7 };

		HashSet<Integer> set = new HashSet<>();
		for (int num : a) {
			set.add(num);
		}

		for (int num : b) {
			if (set.contains(num)) {
				
				System.out.println(num);
		
			}
		}

	}

}
