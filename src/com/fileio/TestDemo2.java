package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestDemo2 {

	public static void main(String[] args) throws IOException {

		File f=new File("C:\\Users\\LENOVO\\Desktop\\python1");

		//Creates the directory named by this abstract pathname.


		boolean flag=f.mkdir();
		if(flag) {
			System.out.println("created a new directory or folder ");
			
		}else {
			System.out.println("Something went wrong");
		}
		File f1=new File(f,"kavya.txt");
		f1.createNewFile();
		System.out.println(f1.canExecute());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getCanonicalPath());
		System.out.println(f1.getFreeSpace());
		
		File f2 = new File("C:\\Users\\LENOVO\\Desktop\\python1");
		String[] files=f2.list();
		int count =0;
		for(String filename:files) {
			System.out.println(filename);
			count++;
	
			
		}
		System.out.println("Total files" + count);
		System.out.println("Total files" + files.length);
	}

}
