package com.callor.algorith.exec;

import com.callor.algorith.utils.Line;

public class NumbersAA {
	
	public static void main(String[] args) {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.printf("%d\t",i + 1);
		}
		System.out.println();
		Line.dLine(50);
		
		int index = 0;
		while(index < 10) {
			System.out.printf("%d\t",index + 1);
			index++;
		}
		
		System.out.println();
		Line.dLine(50);
		index = 0;
		while(true) {
			System.out.printf("%d\t",index + 1);
			index++;
			if(index >= 10) {
				break;
			}
		}
		
		System.out.println();
		Line.dLine(50);
		index = 0;
		while(index < 10) {
			System.out.printf("%d\t",index++ + 1);
		}
		
	}

}
