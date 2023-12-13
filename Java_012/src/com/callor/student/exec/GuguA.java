package com.callor.student.exec;

public class GuguA {
	public static void main(String[] args) {
		
		for(int dan = 2 ; dan < 10 ; dan++) {
			for(int num = 1 ; num < 10 ; num ++) {
				System.out.printf("%d x %d = %d\n",dan, num, dan * num);
			}
		}

		for(int num = 1 ; num < 10 ; num++) {
			for(int dan = 2 ; dan < 10 ; dan ++) {
				System.out.printf("%d x %d = %d\t",dan, num, dan * num);
			}
			System.out.println();
		}

		
	}

}
