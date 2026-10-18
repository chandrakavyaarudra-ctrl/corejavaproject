package com.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collections5 {

	public static void main(String[] args) {

		Collection <String> names=new ArrayList<>();
		
		names.add("Virat Kohli");
		names.add("Rohit Sharma");
		names.add("MS Dhoni");
		names.add("Hardik Pandya");
		names.add("Jasprit Bumrah");
		names.add("Suryakumar Yadav");
		names.add("Shubman Gill");
		names.add("KL Rahul");
		names.add("Ravindra Jadeja");
		names.add("Rishabh Pant");
		
		
		System.out.println("*****************************");
		Object[] objs = names.toArray();
		for(Object ob:objs) {
			System.out.println(ob);
		}
		
		System.out.println("***********************************");
		
		Iterator <String> itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
