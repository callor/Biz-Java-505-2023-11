package com.callor.arrays;

public class ArraysGA {
	
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
//			if(scoreKors[i] < 60) gradeScore = "F";
			if(scoreKors[i] >= 60) gradeScore = "D";
			if(scoreKors[i] >= 65) gradeScore = "D+";
			if(scoreKors[i] >= 70) gradeScore = "C";
			if(scoreKors[i] >= 75) gradeScore = "C+";
			if(scoreKors[i] >= 80) gradeScore = "B";
			if(scoreKors[i] >= 85) gradeScore = "B+";
			if(scoreKors[i] >= 90) gradeScore = "A";
			if(scoreKors[i] >= 95) gradeScore = "A+";
			
			System.out.println(gradeScore);
		}
		System.out.println("=".repeat(30));
		
	}

}
