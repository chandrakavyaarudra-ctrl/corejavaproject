package com.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

class Student {

	@Override
	public String toString() {
		return "kavya";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
	}

}

//HashMap vs WeakHashMap

//HashMap is dominating garbage collector, so nullified objects was not removed

//Garbage collector dominating WeakHashMap,so nullified object removed from the heap
public class TestDemo1 {

	public static void main(String[] args) throws InterruptedException {

		Map<Object, String> map = new WeakHashMap<>();
		System.out.println(map);

		Student s = new Student();
		System.out.println(s);
		map.put(s, "Chandu");
		System.out.println(map);
		s = null;
		System.gc();
		Thread.sleep(3000);
		System.out.println(map);

	}

}
