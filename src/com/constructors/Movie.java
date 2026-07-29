package com.constructors;

public class Movie {
	String movieName;
	String heroName;
	String director;
	int rating;
	
	Movie(){
		System.out.println("No arg constructor : ");
	}
	
	Movie(String movieName,String heroName,String director,int rating){
		this.movieName=movieName;
		this.heroName=heroName;
		this.director=director;
		this.rating=rating;
		
	}
	void displayDetails() {
		System.out.println("movieName : " + movieName);
		System.out.println("heroName : " + heroName);
		System.out.println("director : " + director);
		System.out.println("rating : " + rating);
	}

	public static void main(String[] args) {
		Movie m = new Movie("kotha bangaru lokam","Varun sandesh","Srikanth Addala",6);
		Movie m1 = new Movie();
		m.displayDetails();
		m1.displayDetails();

	}

}
