


package com.brn.java;

/**
 * 
 * @description
 * @author BRN_Brian
 * @date 2022年5月23日下午6:02:53
 * @version 
 *
 */

public class BubbleSortTest {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] { 43,33,66,0,-1,-66,100,101,96};
		
		//1. bubble sort:compare two adjacent items from 1st 2 items
		for(int i = 0;i < arr.length - 1;i++) {
			for(int j = 0;j < arr.length - 1 -i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + "\t");
		}
		
	}

}
