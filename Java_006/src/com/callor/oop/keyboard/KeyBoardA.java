package com.callor.oop.keyboard;

import java.util.Scanner;

public class KeyBoardA {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.println("=".repeat(50));
		System.out.println("10이상의 정수를 입력하세요");
		System.out.print("정수 >> ");
		String str = scan.nextLine();
		
		try {
			num = Integer.valueOf(str);
		} catch (Exception e) {
			System.out.println("정수를 정확히 입력하세요");
			System.out.println("프로젝트를 다시 실행 해 주세요");
			return;
		}
		if(num < 10) {
			System.out.println("10보다 큰값을 입력해 주세요");
			System.out.println("프로젝트를 다시 실행 해 주세요");
			return;
		}
		for(int index = 0 ; index < num ; index++) {
			if(num % 2 == 0) {}
			if((index+1) % 2 == 0) {
				System.out.println(index + 1);
			}
		}
	}
}
