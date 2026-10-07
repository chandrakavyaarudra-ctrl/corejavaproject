package com.fileio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class book implements Serializable{
	int bookid;
	String title;
	String Author;
	double price;
}
public class Serialization {
	

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		
		book b = new book();
		
		File f =new File("C:\\Users\\LENOVO\\Desktop\\python1\\java1");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(b);

		
	}

}
