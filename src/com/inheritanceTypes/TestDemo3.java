package com.inheritanceTypes;

class Employee {

	void calculateSalary() {
		System.out.println("Employee Salary");
	}
}

	class Developer extends Employee {
		@Override
		void calculateSalary() {
			System.out.println("Developer Salary : 50000");
		}
	}

	class Tester extends Employee {
		@Override
		void calculateSalary() {
			System.out.println("Tester Salary : 40000");
		}
	}

	class Manager extends Employee {
		@Override
		void calculateSalary() {
			System.out.println("Manager Salary : 70000");
		}
	}

public class TestDemo3 {

	public static void main(String[] args) {
		Employee e = new Employee();
		Employee e1 = new Developer();
		Employee e2 = new Tester();
		Employee e3 = new Manager();
		
		e.calculateSalary();
		e1.calculateSalary();
		e2.calculateSalary();
		e3.calculateSalary();

	}
}
