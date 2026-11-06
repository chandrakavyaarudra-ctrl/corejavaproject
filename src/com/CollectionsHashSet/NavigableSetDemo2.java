package com.CollectionsHashSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo2 {

	public static void main(String[] args) {

		NavigableSet<Integer> set = new TreeSet<>();

		set.add(15);
		set.add(25);
		set.add(35);
		set.add(45);
		set.add(55);
		set.add(65);

		System.out.println(set);

		System.out.println(set.lower(45));
		System.out.println(set.floor(45));

		System.out.println(set.higher(45));
		System.out.println(set.ceiling(50));

		System.out.println(set.descendingSet());
	}

}
