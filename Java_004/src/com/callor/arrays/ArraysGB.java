package com.callor.arrays;

public class ArraysGB {
	
	public static void main(String[] args) {
		int[] scoreKors = new int[10];
		for(int i = 0 ; i < scoreKors.length ; i++) {
			scoreKors[i] = (int)(Math.random() * 50) + 51;
		}
		
		System.out.println("=".repeat(30));
		System.out.println("국어\t평점");
		System.out.println("-".repeat(30));
		for(int i = 0 ; i < scoreKors.length ; i++) {
			System.out.printf("%3d\t", scoreKors[i]);
			String gradeScore = "F";
			/*
			 * if(조건){실행1} else {실행2} 
			 * 		만약 조건이 참이면 실행1이  수행되고
			 * 		그렇지 않으면 실행2가 수행된다
			 * 
			 *  if(조건1){ 실행 1} 
			 *  else if(조건2) { 실행2 } 
			 *  else { 실행3 }
			 *  	먼저 조건1이 참인지 검사하여 참이면 실행1 수행
			 *  	그렇지않으면 조건2가 참인지 다시 검사하여
			 *  		참이면 실행2가 수행
			 *  	두 조건이 모두 참이 아니면 실행3이 수행
			 *  
			 */
			if(scoreKors[i] >= 95) gradeScore = "A+";
			else if(scoreKors[i] >= 90) gradeScore = "A";
			else if(scoreKors[i] >= 85) gradeScore = "B+";
			else if(scoreKors[i] >= 80) gradeScore = "B";
			else if(scoreKors[i] >= 75) gradeScore = "C+";
			else if(scoreKors[i] >= 70) gradeScore = "C";
			else if(scoreKors[i] >= 65) gradeScore = "D+";
			else if(scoreKors[i] >= 60) gradeScore = "D";
			
			System.out.println(gradeScore);
		}
		System.out.println("=".repeat(30));
		
	}

}
