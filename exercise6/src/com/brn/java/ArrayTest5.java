




package com.brn.java;

/**
 * 
 * @description
 * @author BRN_Brian
 * @date 2022年5月17日下午5:38:09
 * @version 
 *
 */

public class ArrayTest5 {
	
	public static void main(String[] args) {
		
		String[] arr1 = new String[]{"jj","bb","qq","dd","kk","ll"};
		
		//duplicate
		String[] arr2 = new String[arr1.length];
		for(int i = 0;i < arr2.length;i++) {
			arr2[i] = arr1[i];
		}
		
		//reverse option1
		/*for(int i = 0;i < arr2.length / 2;i++) {
			String temp = arr1[i];
			arr1[i] = arr1[arr1.length - i - 1];
			arr1[arr1.length - i - 1] = temp;		
		}*/
		
		//reverse option2
		for(int i = 0, j = arr1.length - 1;i < j;i++, j--) {
			String temp = arr1[i];
			arr1[i] = arr1[j];
			arr1[j] = temp;
		}
		
		
		for(int i = 0; i < arr1.length;i++) {
			System.out.print(arr1[i] + "\t");
		}
		
		System.out.println();
		
		//linear lookup
		String target1 = "jb";
		boolean tag = true;
		
		for(int i = 0; i < arr1.length;i++) {
			
			if(target1.equals(arr1[i])) {
				System.out.println("Found, location is at " + i);
				tag = false;
				break;
			}
		}
		if(tag) {
			System.out.println("Nope");
		}
		
		//Half lookup: for an array that is in order
		
		int[] arr3 = new int[] {-55,-46,-1,0,5,66,102,201};
		
		int target2 = -66;
		boolean tag1 = true;
		int first = 0;//initial first index
		int last = arr3.length - 1;//initial last index
		
		while(first <= last) {
			int mid = (first + last) / 2;
			if(target2 == arr3[mid]) {
				System.out.println("Found, it's at " + mid);
				tag1 = false;
				break;
			}else if(arr3[mid] > target2){
				last = mid - 1;
			}else {//arr3[mid] < target2
				first = mid + 1;
			}
		}
		if(tag1) {
			System.out.println("no shxt");
		}
		
		
	
	
	}

}
