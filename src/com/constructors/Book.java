package com.constructors;

public class Book {
	int bookid=101;
	String bookName="data";
	String Author="rani";
	double price=788d;
	
	Book(){
		System.out.println("No arg constructor : ");
	}
	
	Book(int bookid,String bookName,String Author,double price){
		this.bookid=bookid;
		this.bookName=bookName;
		this.Author=Author;
		this.price=price;
	}
	void displayDetails() {
		System.out.println("bookid: " + bookid);
		System.out.println("bookName :" + bookName);
		System.out.println("Author : " + Author);
		System.out.println("price : " + price);
	}

	public static void main(String[] args) {
		Book b = new Book(101,"novel","raju",699);
		Book b1 = new Book();
		b.displayDetails();
		b1.displayDetails();
		
	}

}
