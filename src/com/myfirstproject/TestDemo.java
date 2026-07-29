package com.myfirstproject;
import java.util.Scanner;
//with return type + with arguments
//wap to print the Areas of Triangle, circle & square.
//triangle 0.5 * base *height
//Rectangle Length *breadth
//Square : side * side
//circle : PI * r * r

public class TestDemo {

	public static void main(String[] args) {
		
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		TestDemo t = new TestDemo();
		
		
		System.out.println("**************Finding Area of Triangle*****************");
		System.out.println("Enter Height : ");
		double h = sc.nextDouble();
		System.out.println("Enter Base : ");
		double b = sc.nextDouble();
		double arTri = t.getAreaOfTriangle(10,15);
		System.out.println("Area of triangle is : " + arTri);
		
		
		System.out.println("***********Area of Circle********************");
		System.out.println("Enter Radius : ");
		double r = sc.nextDouble();
		double areaOfCircle = t.findAreaOfCircle(r);
		System.out.println("Area of Circle is : " + areaOfCircle);
		
		System.out.println("*******************find Area Of Square********************");
		System.out.println("Enter Side :");
		double s = sc.nextDouble();
		double AreaOfSquare = t.findAreaOfSquare(s);
		System.out.println("Area of Square is : " + AreaOfSquare);
		
		System.out.println("*****************Area of Rectangle***************");
		System.out.println("Enter length : ");
		double length = sc.nextDouble();
		System.out.println("Enter breadth : ");
		double bth = sc.nextDouble();
		double areaOfRectangle = t.areaOfRectangle(length, bth);
		System.out.println("Area of Rectangle : " + areaOfRectangle);

		
		
		System.out.println("main method ended ");
		
	
	}
	
	double areaOfRectangle(double len,double breadth) {
		double rec = len * breadth;
		return rec;
	}
	
	double findAreaOfSquare(double side) {
		double square = side * side;
		return square;
	}
	
	double findAreaOfCircle(double radius) {
		double areaOfCircle = Math.PI * radius * radius;
		return areaOfCircle;
	}
	
	double getAreaOfTriangle(double base, double height){
		double arTri = 0.5 * base * height;
		return arTri;
		
	}
	
	
	
	
	

}
