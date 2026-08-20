package com.Arrays;

public class Minimum2Darray {

	public static void main(String[] args) {
		int[][] arr= {
				{2,4,6},
				{3,5,8},
				{1,30,7}
		};
		int min=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]<min) {
					min=arr[i][j];
				}
			}
			
		}
		System.out.print("minimum number of array:" + min);
	}

}
