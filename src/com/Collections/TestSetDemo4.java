package com.Collections;

import java.util.HashSet;
import java.util.Set;

public class TestSetDemo4 {
	
	static class Student{
		int id;
		String name;
		
		@Override
		public boolean equals(Object obj) {
			return super.equals(obj);
		}
		
		@Override
		public int hashCode() {
			return super.hashCode();
		}
		
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}

		public Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		
	}

	public static void main(String[] args) {
		
		  TestSetDemo4 t = new TestSetDemo4();


		Student s1=new Student(1,"Kavya");
		Student s2=new Student(1,"Kavya");
		
		Set<Student> ss=new HashSet<>();
		ss.add(s1);
		ss.add(s2);
		System.out.println(s1);
		System.out.println(s2);
	}

}
