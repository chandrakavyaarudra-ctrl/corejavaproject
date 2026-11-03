package com.CollectionsHashSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMapDemo1 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("TG", "Telangana");

		map.put("AP", "Andhara Pradesh");
		map.put("TN", "Karanataka");
		map.put("AP", "Amaravati");
		map.put("TS", "Hyderabad");
		map.put("TN", "Chennai");
		map.put("KA", "Bengaluru");
		map.put("KL", "Thiruvananthapuram");
		System.out.println(map);
		map.put("TG", "Telangana");
		System.out.println(map.containsKey("UP"));
		System.out.println(map.containsValue("Hyderabad"));
		System.out.println(map.get("TN"));
		System.out.println(map.isEmpty());

//		Set<Entry<String,String>> entries=map.entrySet();
//		
//		System.out.println(entries);
//		
//		for(Entry <String,String> entry:entries) {
//			System.out.println(entry.getKey() + "->" + entry.getValue());
//			
//		}

	}

}
