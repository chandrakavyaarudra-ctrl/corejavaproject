package com.CollectionsHashSet;

import java.util.HashSet;

public class UniqueElements {

	public static void main(String[] args) {

		int[] a = { 1, 2, 2, 3, 4, 4, 5 };

		HashSet<Integer> set = new HashSet<>();

		for (int num : a) {
			set.add(num);
		}
		for (int num : set) {
			System.out.println("Unique elements : " + num);
		}
	}

}
