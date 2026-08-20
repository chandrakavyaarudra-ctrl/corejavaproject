package com.Arrays;

public class LargestMax2Darray {

	public static void main(String[] args) {
		int[][] arr = {
				{2,34,68},
				{56,65,99},
				{55,44,33}
				
		};
		int max = 0;
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}
		System.out.print("Maximum number of the array: " + max);
	}

}
