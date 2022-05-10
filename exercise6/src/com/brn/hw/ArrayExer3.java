





package com.brn.hw;

/**
 * 
 * @description
 * @author BRN_Brian
 * @date 2022年5月9日下午5:52:55
 * @version 
 *
 */

public class ArrayExer3 {
	
	public static void main(String[] args) {
		
		int[] arr1 = new int[6];
		
		for(int i = 0;i < arr1.length;i++) {
			arr1[i] = (int)(Math.random() * 30) + 1;
			
			for(int j = 0;j < i;j++) {
				if(arr1[i] == arr1[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0;i < arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}

}
