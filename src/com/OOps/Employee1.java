package com.OOps;

public class Employee1 {

	public static void main(String[] args) {
		System.out.println("Main method started ");
		System.out.println("employee infoo ");

		Employee emp = new Employee();

		emp.setEid(18);
		emp.setEname("Virat");
		emp.setSalary(18000000000.00);

		System.out.println(emp.getEid());
		System.out.println(emp.getEname());
		System.out.println(emp.getSalary());

		// Accessing the data outside of the class

//		emp.eid=18;
//		emp.ename="Virat";
//		emp.Salary=180000000.0;
//		System.out.println(emp.eid);
//		System.out.println(emp.ename);
//		System.out.println(emp.Salary);
	}

}
