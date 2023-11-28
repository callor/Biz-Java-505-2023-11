package com.callor.hello.arrays;

public class ArraysA {
	
	public static void main(String[] args) {
		int num = 0;
		for(int i = 0; i < 5;i++) {
			num = (int)(Math.random() * 50) + 51;
		}
		for(int i = 0 ; i < 5 ; i++) {
			System.out.printf("%d 번째 %d\n", i+1, num);
		}
		
	}

}
