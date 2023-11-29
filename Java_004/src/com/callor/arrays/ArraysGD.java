package com.callor.arrays;

public class ArraysGD {
	/*
	 * score 변수에 정수값(점수)을 전달받아서
	 * 점수에 따라 평점을 찾고 평점을 return 하는 method
	 */
	public static String gradeScore(int score) {
		String result = "F";
		if(score>=95) result = "A+";
		else if(score>=90) result = "A";
		else if(score>=85) result = "B+";
		else if(score>=80) result = "B";
		else if(score>=75) result = "C+";
		else if(score>=70) result = "C";
		else if(score>=65) result = "D+";
		else if(score>=60) result = "D";
		return result;
	}
	
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

			// 국어점수를 보내서 평점을 return 받기
			// return 받은 평점은 gradeScore 변수에 할당
			String gradeScore = gradeScore(scoreKors[i]);
			System.out.println(gradeScore);
		}
		System.out.println("=".repeat(30));
		
	}

}
