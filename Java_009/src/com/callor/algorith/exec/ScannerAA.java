package com.callor.algorith.exec;

import java.util.Scanner;

import com.callor.algorith.utils.Line;

public class ScannerAA {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Line.dLine(50);
		System.out.print("첫 번째 정수를 입력하세요 >> ");
		String str = scan.nextLine();
		int num1 = Integer.valueOf(str);

		System.out.print("두 번째 정수를 입력하세요 >> ");
		str = scan.nextLine();
		int num2 = Integer.valueOf(str);
		
		Line.sLine(50);
		System.out.printf("%d + %d = %d\n",
					num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n",
					num1, num2, num1 - num2);
		System.out.printf("%d x %d = %d\n",
					num1, num2, num1 * num2);
		System.out.printf("%d ÷ %d = %d\n",
					num1, num2, num1 / num2);
		
		System.out.printf("%d MOD %d = %d\n",
					num1, num2, num1 % num2);
		Line.dLine(50);
		
		
	}

}
