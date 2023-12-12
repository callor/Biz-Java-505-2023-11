package com.callor.student.utils;

public class Line {
	
	public static void dLine(int length) {
		System.out.println("=".repeat(length));
	}
	
	public static void sLine(int length) {
		for(int i = 0 ; i < length ; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
