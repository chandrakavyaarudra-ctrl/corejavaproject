package com.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class TestMapDemo8 {

	public static void main(String[] args) {

		Map<Integer, String> map = new ConcurrentHashMap<>();
		map.put(1, "Kavya");
		map.put(22, "sam");
		map.put(2, "Chandu");
		map.put(4, "Sri");

		Set<Entry<Integer, String>> entries = map.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getValue() + " -" + entry.getKey());
			map.put(18, "Virat");
		}
		System.out.println(map);

	}

}
