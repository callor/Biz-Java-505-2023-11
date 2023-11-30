package com.callor.oop.input;

import java.util.Scanner;

/*
 * 입력받은 문자열형 정수를 정수로 변환 하는 과정에서 
 * Exception 이 자주 발생하여 Exception 처리를 하자
 * 
 */
public class InputEC {
	
	public static void main(String[] args) {
		int[] nums = new int[3];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=".repeat(30));
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.println("끝내려면 QUIT 입력하세요");
			System.out.printf("정수 %d >> ",i + 1);
			String str = scan.nextLine();
			if(str.equals("QUIT")) break;
			try {
				nums[i] = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해 주세요");
				i--;
				continue;
			}
		}
		System.out.println("=".repeat(30));
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("=".repeat(30));
		
		
		
		
	}

}
