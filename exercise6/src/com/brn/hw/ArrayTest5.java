




package com.brn.hw;
/**
 * 
 * @description
 * @author BRN_Brian
 * @date 2022年5月10日下午6:59:27
 * @version 
 *
 */
public class ArrayTest5 {
	
	public static void main(String[] args) {
		//create array with 10 integers
		int[] arr1 = new int[10];
		float sum = 0;
		//initialize array in the correct range
		for(int i = 0;i < arr1.length;i++) {
			arr1[i] = (int)(Math.random() * 90 + 10);
			sum += arr1[i];
		}
		
		//initialize max and min, then calculate  
		int max = arr1[0];
		int min = arr1[0];
		for(int i = 0;i < arr1.length;i++) {
			if(max < arr1[i]) {
				max = arr1[i];
			}
			if(min > arr1[i]) {
				min = arr1[i];
			}
		}
		float aver = sum / arr1.length;
		
		//output
		System.out.println("Sum is " + sum + ", " + "Average is " + aver);
		System.out.println("max is " + max + ", " + "min is " + min);
		
		
	}

}
