package com.CollectionsHashSet;

import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {

	public static void main(String[] args) {

		int[] a= {1,2,2,3,1,4,3,8,8,9,5};
		Map<Integer,Integer> map = new HashMap<>();
		for(int num:a) {
			if(map.containsKey(num)) {
			map.put(num, map.get(num)+1);
			
		}else {
			map.put(num, 1);
		}
	}

	System.out.println("Frequencies: " +map);

	}
}
