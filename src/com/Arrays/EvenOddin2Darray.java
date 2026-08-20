package com.Arrays;

public class EvenOddin2Darray {

	public static void main(String[] args) {
		int[][] arr= {
				{2,4,6},
				{3,5,8},
				{1,30,7}
		};
		int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]%2==0) {
					even++;
				}else {
					odd++;
				}
			}
		}
		System.out.println("Even  Numbers in array : " + even);
		System.out.println("Odd Numbers in array : " + odd);
	}

}
