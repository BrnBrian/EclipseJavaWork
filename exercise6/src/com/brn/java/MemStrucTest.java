



package com.brn.java;

/**
 * 
 * @description
 * @author BRN_Brian
 * @date 2022年5月3日下午7:08:57
 * @version 
 *
 */

public class MemStrucTest {
	
	public static void main(String[] args) {
		
		int[] arr1 = new int[]{1,2,3};
		String[] arr2 = new String[4];
		
		arr2[1] = "jackson";
		arr2[2] = "bosco";
		arr2 = new String[3];
		arr1 = new int[5];
		
		System.out.println(arr2[1]);//null
		System.out.println(arr1[4]);//0
		
		
	}

}
