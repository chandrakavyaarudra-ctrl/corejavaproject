package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class List3 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();
		names.add("Java");

		names.add("HTML");
		names.add("Spring");
		List<String> names1 = names.subList(1, 3);

		System.out.println(names1);

		names1.add("Vcube");
		System.out.println(names1);

		System.out.println(names);

	}

}
