package com.OOpsPolymorphisms;

public class TestDemo3 {
	// WAP to find Area of a triangle rectangle square and circle
	// Triangle : 0.5*base*height
	// Rectangle : length * breadth
	// Square : side * side
	// Circle : PI * r *r

	void main(String[] args) {

		System.out.println("Area of Triangle e : " + findArea(45.5, 16.9));
		System.out.println("Area of circle :" + findArea(45.5));
		System.out.println("Area of rectangle : " + findArea(45.5F, 65.5F));
		System.out.println("Area of Square :  " + findArea(70));

	}

	double findArea(double base, double height) {
		return 0.5 * base * height;
	}

	double findArea(double r) {
		return Math.PI * r * r;
	}

	double findArea(float length, float breadth) {
		return length * breadth;
	}

	double findArea(float side) {
		return side * side;
	}

}
