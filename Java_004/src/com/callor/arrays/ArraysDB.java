package com.callor.arrays;

public class ArraysDB {
	
	public static void main(String[] args) {
		
		int STUDENT_LENGTH = 10;
		
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEngs= new int[STUDENT_LENGTH];
		int[] scoreMaths = new int[STUDENT_LENGTH];
		
		int[] sums = new int[STUDENT_LENGTH];
		float[] avgs = new float[STUDENT_LENGTH];
		
		for(int i = 0 ; i < scoreKors.length ; i++) {
			scoreKors[i] = (int)(Math.random() * 50) + 51;
		}
		for(int i = 0 ; i < scoreEngs.length ; i++) {
			scoreEngs[i] = (int)(Math.random() * 50) + 51;
		}
		for(int i = 0 ; i < scoreMaths.length ; i++) {
			scoreMaths[i] = (int)(Math.random() * 50) + 51;
		}
		
		for(int i = 0 ; i < STUDENT_LENGTH ; i++) {
			sums[i] = scoreKors[i];
			sums[i] += scoreEngs[i];
			sums[i] += scoreMaths[i];
		}
		for(int i = 0 ; i < STUDENT_LENGTH ; i++) {
			avgs[i] = (float)sums[i] / 3;
		}
		
		System.out.println("=".repeat(80));
		System.out.println(" 샛별반 성적표");
		System.out.println("-".repeat(80));
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-".repeat(80));
		for(int i = 0 ; i < STUDENT_LENGTH ; i++) {
			System.out.printf("%3d\t", scoreKors[i]);
			System.out.printf("%3d\t", scoreEngs[i]);
			System.out.printf("%3d\t", scoreMaths[i]);
			System.out.printf("%4d\t", sums[i]);
			System.out.printf("%5.2f\n", avgs[i]);
		}
		System.out.println("=".repeat(80));
		
		
		
	}

}
