package com.CollectionsHashSet;

import java.util.HashSet;

public class Duplicateelements {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 2, 4, 3, 5 };
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();

		for (int num : a) {
			if (!set.add(num)) {
				duplicates.add(num);
			}
		}

		for (int num : duplicates) {
			System.out.println("duplicates elements: " + num);
		}
	}

}
