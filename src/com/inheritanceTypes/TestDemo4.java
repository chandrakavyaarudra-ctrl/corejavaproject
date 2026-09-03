package com.inheritanceTypes;

class Course {
	void duration() {
		System.out.println("Courses");
	}
}

class javaCourse extends Course{
	@Override
	void duration() {
		System.out.println("JavaCourse : 6 Months");
	}
}

class PythonCourse extends Course{
	@Override
	void duration() {
		System.out.println("PythonCourse : 3 Months");
	}
	
}

class SQLCourse extends Course{
	@Override
	void duration() {
		System.out.println("SQLCourse :7 months");
	}
	
}
public class TestDemo4 {

	public static void main(String[] args) {
		Course c = new Course();
		Course d1=new javaCourse();
		Course d2=new PythonCourse();
		Course d3 = new SQLCourse();
		c.duration();
		d1.duration();
		d2.duration();
		d3.duration();
		
		
	}

}
