package com.CollectionsHashSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

//WAP to print frequency of a given String from a characters
//java --> j=1 a=2 v=1
public class TestMapDemo2 {

	public static void main(String[] args) {

		Map<Character, Integer> map = new HashMap<>();
		System.out.println(map);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");

		String str = sc.nextLine();// java is simple
		char[] ch = str.toCharArray();
		
		for(char c: ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		
		System.out.println(map);

		Set<Entry<Character,Integer>>entries=map.entrySet();
		for(Entry<Character,Integer> entry : entries) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
			
		}
	}

}
