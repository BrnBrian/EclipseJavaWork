package com.brn.java;

/**
 * 
 * @description
 * @author BRN_Brian
 * @date 2022年5月4日下午9:53:42
 * @version 
 *
 */

public class ArrayTest3 {
	public static void main(String[] args) {
		
		int[] arr1 = new int[]{1,2,3};//1
		
		int[][] arr2 = new int[][]{{1,2,3},{4,7},{9,7}};//static 2
		String[][] arr3 = new String[3][2];//dynamic 2
		String[][] arr4 = new String[3][];//dynamic 2
		
		System.out.println(arr2[0][2]);//output a specific value
		
		//Acquire the length/number of array
		System.out.println(arr2.length);//3
		System.out.println(arr2[2].length);//2
		
		//output all values
		for(int i = 0;i < arr2.length;i++) {
			
			for(int j = 0;j < arr2[i].length;j++) {
				
				System.out.print(arr2[i][j] + " ");
				
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
