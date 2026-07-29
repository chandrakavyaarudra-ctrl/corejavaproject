package com.myfirstproject;

public class employee1 {
	Integer Empno=201;
	String Ename="Kavya";
	Double Salary=90000.0;
	String Hiredate="5-03-2026";
	Integer Experience=2;
	
	Double annual_sal=Salary*12;
	Double annual_bonus=annual_sal/10;
	Double total_sal=annual_sal+annual_bonus;
	
	{
		System.out.println(Empno);
		System.out.println(Ename);
		System.out.println(Salary);
		System.out.println(Hiredate);
		System.out.println(Experience);
		System.out.println(annual_sal);
		System.out.println(annual_bonus);
		System.out.println(total_sal);
		
	}
	

	public static void main(String[] args) {
		 employee1 t = new  employee1();
		
		
	}

}
