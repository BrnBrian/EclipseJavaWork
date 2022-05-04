




package com.brn.hw;
/**
 * 
 * @description
 * @author BRN_Brian
 * @date 2022年5月3日下午7:57:13
 * @version 
 *
 */

import java.util.Scanner;

public class ArrayExer1 {
	
	public static void main(String[] args) {
		
		//Scanner for info input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the number of students:");
		int studentNum = scan.nextInt();
		
		//create array for students' points
		int[] studentPts = new int[studentNum];
		
		//enter students' points
		for(int i = 0;i < studentNum;i++) {
			System.out.print("Please enter the score of student " + (i + 1) + ":");
			studentPts[i] = scan.nextInt();
		}
		
		//find out the highest points
		int maxPt = 0;
		for(int i = 0;i < studentNum;i++) {
			if (maxPt < studentPts[i]) {
				maxPt = studentPts[i];
			}
		}
		System.out.println("The highest score is " + maxPt);
		
		//print out info of each student
		char grade;
		for(int i = 0;i < studentPts.length;i++){
			if(studentPts[i] >= 90){
				
				grade = 'A';
				
			}else if(studentPts[i] >= 80){
				
				grade = 'B';
			
			}else if(studentPts[i] >= 70){
				
				grade = 'C';
			
			}else{
				
				grade = 'D';
			}
		
		System.out.println("Student" + (i + 1) + " score is " + studentPts[i] + ", and grade is " + grade);
		}
		
		
		
		/*
		 * option2:
		 for(int i = 0;i < studentPts.length;i++)
			if(studentPts[i] >= 90){
				
				System.out.println("Student" + i + " score is " + studentPts[i] +", and grade is A");
				
			}else if(studentPts[i] >= 80){
				
				System.out.println("Student" + i + " score is " + studentPts[i] +", and grade is B");
			
			}else if(studentPts[i] >= 70){
				
				System.out.println("Student" + i + " score is " + studentPts[i] +", and grade is C");
			
			}else{
				
				System.out.println("Student" + i + " score is " + studentPts[i] +", and grade is D");
		
	}*/
			
		
			
			

		
		
	}

}
