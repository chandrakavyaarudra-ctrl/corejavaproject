package com.OOps;

public class S1 {

	public static void main(String[] args) {

		System.out.println("main method started");

		Student s = new Student();

		s.setsid(101);
		s.setsname("kavya");
		s.setmarks(50.00);

		System.out.println(s.getsid());
		System.out.println(s.getsname());
		System.out.println(s.getmarks());
	}
}
