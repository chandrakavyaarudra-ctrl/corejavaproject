package com.CollectionsHashSet;

import java.util.HashSet;

public class SubSetCheck {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 2, 3 };

		HashSet<Integer> set = new HashSet<>();
		for (int num : a) {
			set.add(num);
		}
		boolean result = true;

		for (int num : b) {

			if (!set.contains(num)) {

				result = false;
				break;
			}

		}
		System.out.println("Is B a subset of A? : " + result);
	}

}
