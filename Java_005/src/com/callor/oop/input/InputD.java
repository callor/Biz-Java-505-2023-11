package com.callor.oop.input;

import java.util.Scanner;
public class InputD {
	public static boolean operator() {
		int num1 = 0;
		int num2 = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=".repeat(50));
		System.out.println("4칙연산 계산기");
		System.out.println("-".repeat(50));
		
		System.out.println("두 개의 정수를 입력받아");
		System.out.println("사칙연산을 수행합니다");
		System.out.println("두 개의 정수를 입력해 주세요");
		System.out.print("정수 1 >> ");
		String str1 = scan.nextLine();
		
		num1 = Integer.parseInt(str1);
		Float.parseFloat(str1);
		
		System.out.print("정수 2 >> ");
		String str2 = scan.nextLine();
		num2 = Integer.valueOf(str2);
		Float.valueOf(str2);
				
		System.out.printf("입력한 정수는 %s, %s 입니다\n",str1,str2);
		System.out.println(str1 + str2);
		
		System.out.println("=".repeat(50));
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d ÷ %d = %d\n", num1, num2, num1 / num2);
		System.out.println("=".repeat(50));
//		scan.close();
		return true;
	}

	public static void main(String[] args) {
		
		int count = 0;
		boolean isExit = true;
		while(isExit) {
			operator();
			count++;
		}
		
	}
}
