package com.stringhandling;

public class TestStrDemo1 {

	public static void main(String[] args) {

		String str1="Java";//String Literal
		String str5="Java";
		String str2=new String("Srikanth");//String with new key word
		
		String str6=new String("Srikanth");//1 object only Heap
		String str3 = "vcube" + "Java";//Concatenation
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str6));
		
		String str4 = str3;//Re-assigning the object
		System.out.println(str1);
		System.out.println(str5);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str5));
	}

}
