package com.OOps;

//DTO : data transfer object
//POJO : plain old java object
//Model : Data Model

public class Employee {

	private int eid;
	private String ename;
	private double Salary;

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEid() {
		return eid;

	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;

	}

	public void setSalary(double Salary) {
		if (Salary > 0) {
			this.Salary = Salary;
		}else {
			System.err.println("Invalid salary details ");
		}
	}

	public double getSalary() {
		return Salary;
	}

}
