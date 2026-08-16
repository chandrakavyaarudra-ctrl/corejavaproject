package com.Arrays;

public class EvenNumbers {

	public static void main(String[] args) {
		int[] arr = {45,18,7,1,2,3};
		for(int i =0 ;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+ " ");
			}
		}
	}

}
