package com.Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortDemo1 {

	public static void main(String[] args) {

		SortedSet<Integer> ss = new TreeSet<>();
//		ss.add(null);
//		ss.add(null);
		ss.add(1);

		ss.add(5);

		ss.add(2);

		ss.add(6);

		ss.add(8);

		ss.add(4);
		System.out.println(ss);
		System.out.println(ss.first());
		System.out.println(ss.last());
		System.out.println(ss.headSet(4));

		System.out.println(ss.tailSet(4));

		System.out.println(ss.subSet(2, 5));
		
		System.out.println(ss.reversed());

	}

}
