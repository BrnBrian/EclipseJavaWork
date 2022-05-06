



package com.brn.java;

/**
 * 
 * @description
 * @author BRN_Brian
 * @date 2022年5月5日下午5:31:18
 * @version 
 *
 */

public class ArrayTest4 {
	
	public static void main(String[] args) {
		
		int[][] arr1 = new int[4][3];
		System.out.println(arr1[0]);//address
		System.out.println(arr1[0][0]);//0
		
		float[][] arr2 = new float[4][3];
		System.out.println(arr2[0]);//address
		System.out.println(arr2[0][0]);//0.0
		
		String[][] arr3 = new String[4][3];
		System.out.println(arr3[0]);//address
		System.out.println(arr3[0][0]);//null
		
		int[][] arr4 = new int[4][];
		System.out.println(arr4[0]);//null
		System.out.println(arr4[0][0]);//error
		
		
	}

}
