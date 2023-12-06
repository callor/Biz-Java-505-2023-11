package com.callor.algorith.exec;

import java.util.Scanner;

public class ScannerBA {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		while(true) {
			System.out.print("첫번째 정수 >> ");
			String str = scan.nextLine();
			try {
				num1 = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("** 정수를 정확히 입력해 주세요");
				continue;
			}
			break;
		}
		while(true) {
			System.out.print("두번째 정수 >> ");
			String str = scan.nextLine();
			try {
				num2 = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("** 정수를 정확히 입력해 주세요");
				continue;
			}
			break;
		}
		System.out.printf("%d + %d = %d\n",num1, num2, num1 + num2);
	}
}
