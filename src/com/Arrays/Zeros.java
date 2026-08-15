package com.Arrays;

public class Zeros {

	public static void main(String[] args) {

		int[] arr = {0,1,0,3,12};
		int index=0;
		for(int i = 0; i < arr.length;i++) {
			if(arr[i]!=0) {
				arr[index]=arr[i];
				index++;
			}
		}
		while(index < arr.length) {
			arr[index]=0;
			index++;
		}
		System.out.println("After zeros are ramoved : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
