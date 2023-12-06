package com.callor.algorith.exec;

import com.callor.algorith.utils.Line;

public class NumbersEA {
	
	public static void main(String[] args) {
		for(int dan = 2 ; dan < 10 ; dan ++) {
			for(int item = 1 ; item < 10 ; item++) {
				if( (dan * item) % 2 == 0) {
					System.out.printf("%d x %d = %d\n",dan,item, dan*item);
				}
			}
			Line.sLine(50);
		}
	}

}
