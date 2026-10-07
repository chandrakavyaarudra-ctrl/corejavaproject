package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("Main method started ");
		//create a new file instance by converting the given pathname string into an abstract pathname
		
		File f=new File("C:\\Users\\LENOVO\\Desktop\\python1");
		try {
			System.out.println("in try");
			//automatically creates a new empty file named by this abstract pathname if and only if a file with this name does not yet exists
			if(!f.exists()) {
				boolean flag=f.createNewFile();
				if(flag) {
					System.out.println("File has been created successfully!!");
				}else {
					System.out.println("Something went wrong");
				}
			}else {
				System.out.println("with this name the file already available");
			}
		}catch(IOException e) {
			System.out.println("in catch");
			e.printStackTrace();
		}
		System.out.println("main method ended");
	}

}
