package com.CollectionsHashSet;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {

		String[] a = {"eat","tea","tan","ate","nat","bat"};
		Map<String,List<String>> map = new HashMap<>();
		for(String s:a) {
			char[] ch=s.toCharArray();
			
			Arrays.sort(ch);
			
			String key= new String(ch);
			 if (!map.containsKey(key)) {
	                map.put(key, new ArrayList<>());
	            }

	            map.get(key).add(s);
	        }

	        System.out.println(map.values());
			
			
		}
	}

