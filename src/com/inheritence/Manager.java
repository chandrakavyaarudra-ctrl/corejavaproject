package com.inheritence;

public class Manager extends Employee {
	
	long salary = 50000;
	
	
	@Override
	
	void display() {
		System.out.println("Manager salary " + salary);
	}

	public static void main(String[] args) {
		Employee e1 = new Manager();
		e1.display();
		System.out.println("Salary " + e1.salary);
	}

}
