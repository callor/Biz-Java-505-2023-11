package com.callor.arrays;

public class ArraysAA {
	
	public static void main(String[] args) {
		int[] nums = new int[10];
		for(int i = 0 ; i < 10 ;i++) {
			int rndNum = (int)(Math.random() * 50) + 51;
			nums[i] = rndNum;
		}
		
		for(int i = 0 ; i < 10 ; i++ ) {
			if(nums[i] > 80) {
				System.out.printf("index %d 번 요소값 : %d\n",
						i, nums[i]);
				break;
			}
		}
	}

}
