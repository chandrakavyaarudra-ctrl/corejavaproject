package com.CollectionsHashSet;

import java.util.HashMap;
import java.util.Map;

public class TestMapDemo {

	public static void main(String[] args) {

		Map<String,String> map = new HashMap<>();
		map.put("J", "Java");
		map.put("S", "SQL");
		map.put("R", "React");
		
		System.out.println(map.getOrDefault("A", "J2SE"));
		
		map.put("K", "J2EE");
		System.out.println(map);
	}

}
