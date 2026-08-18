package com.Arrays;

import java.util.Arrays;

public class AddTwoArrays {
	
	//WAP to add two array values into another array

	public static void main(String[] args) {
		int[] a1= {1,2,3};
		int[] a2= {4,5,6};
		int[] a3 = new int[a1.length+a2.length];
		for(int i = 0;i<a1.length;i++) {
			a3[i] = a1[i];
		}
		for(int i = 0; i<a2.length;i++) {
			a3[a1.length+i] = a2[i];
		}
		System.out.println(Arrays.toString(a3));
		
	}

}
