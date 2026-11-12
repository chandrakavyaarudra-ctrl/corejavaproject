package com.multithreding;

public class Student extends Thread {

	String name;
	double attendence;

	Student(String name, double attendence) {
		this.name = name;
		this.attendence = attendence;
	}

	public void run() {
		System.out.println("Student Name : " + name);
		System.out.println("Attendence: " + attendence);
		System.out.println("----------------------------");
	}

	public class StudentThreadDemo {

		public static void main(String[] args) {

			Student s1 = new Student("Kavya", 98.7);
			Student s2 = new Student("Chandu", 90.0);
			Student s3 = new Student("Arun", 85.5);

			s1.start();
			s2.start();
			s3.start();

		}

	}
}
