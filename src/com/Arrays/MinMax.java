package com.Arrays;

public class MinMax {

	public static void main(String[] args) {
		int[] arr= {7,2,1,5,6,-5,8,4,-10};
		int min=0;
		int max=0;
		for(int a:arr) {
			if(a<min) {
				min=a;
			}else if(a>max){
				max=a;
			}
			
		}
		System.out.println("Minimum value from an array is: " + min);
		System.out.println("Miximum value from an array is: " + max);

	}

}
