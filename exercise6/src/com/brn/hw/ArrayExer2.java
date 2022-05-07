



package com.brn.hw;
/**
 * 
 * @description
 * @author BRN_Brian
 * @date 2022年5月7日下午4:18:59
 * @version 
 *
 */
public class ArrayExer2 {
	public static void main(String[] args) {
		//1.create [][]
		int[][] yangTri = new int[10][];
        
		//2.initialize
		for(int i =0;i < yangTri.length;i++) {
			yangTri[i] = new int[i + 1];
			
			//initialize first and last values on each row
			yangTri[i][0] = 1;
			yangTri[i][i] = 1;
			
			//initialize yangTri values
			if(i > 1) {
				for(int j = 1; j < yangTri[i].length - 1; j++) {
					yangTri[i][j] = yangTri[i-1][j-1] + yangTri[i-1][j];
				}
			}
			
		}
		
		//3.output                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
		for(int i = 0;i < yangTri.length;i++) {
			for(int j = 0;j < yangTri[i].length;j++) {
				System.out.print(yangTri[i][j] + " ");
			}
			System.out.println();
		}
	}

}
