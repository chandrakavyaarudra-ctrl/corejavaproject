package com.fileio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Deserailazation {

	public static void main(String[] args) throws IOException {

		
		File f = new File("C:\\Users\\LENOVO\\Desktop\\python1");
		
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
	}

}
