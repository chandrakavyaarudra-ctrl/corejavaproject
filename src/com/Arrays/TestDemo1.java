package com.Arrays;

public class TestDemo1 {
	
	//WAP to print total and avg of the student marks

	public static void main(String[] args) {
		
		int[] marks= {97,98,99,96,95,94};
		int total_marks=0;
		int avg=0;
		for(int m:marks) {
			total_marks=total_marks+m;
		}
		avg = total_marks/marks.length;
		System.out.println("Student_marks: " + total_marks);
		System.out.println("Avg of all the marks :" +avg);

	}
	
}
