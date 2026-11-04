package com.Collections;

import java.util.Hashtable;
import java.util.Map;
//Hashtable
public class TestMapDemo {

	public static void main(String[] args) {

		System.out.println("Main method started");
		Map<Integer,String> map=new  Hashtable<>();
		map.put(1, "Apple");
		map.put(2,"banana");
		map.put(3, "Mango");
		System.out.println(map);
	}

}
