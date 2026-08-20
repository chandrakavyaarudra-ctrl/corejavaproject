package com.Arrays;

import java.util.Arrays;


public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {3,7,1,5,3,3};
		int count=0;
		int count1=0;
		boolean flag = false;
		System.out.println("After Sorting : ");
		System.out.println(Arrays.toString(arr));
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			count++;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag = true;
					
				}
				count1++;
				
			}
			if(!flag) {
				break;
			}
		}
	
		System.out.println(count);
		System.out.println(count1);
		System.out.println("After Sorting : ");
		System.out.println(Arrays.toString(arr));
	}
}


