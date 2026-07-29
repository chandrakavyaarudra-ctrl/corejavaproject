package com.myfirstproject;

public class StudentResultAnalyzer {
	double calculateTotal(int m1,int m2,int m3, int m4, int m5) {
		return m1 + m2 + m3 + m4 + m5;
	}
	 double calculatePercentage(double total) {
		return total/5.0;
	}
	
	double calculateAverage(double total) {
		return total/5.0;
	}
	

	public static void main(String[] args) {
		StudentResultAnalyzer t = new StudentResultAnalyzer();
		
		double total = t.calculateTotal(98,58,78,89,54);
	
		double Percentage= t.calculatePercentage(total);

		double Average = t.calculateAverage(total);
		System.out.println("TotalMarks : " + total);
		System.out.println("Percentage : " + Percentage + "%");
		System.out.println("Avaerage : " + Average);
		
		
	}

}
