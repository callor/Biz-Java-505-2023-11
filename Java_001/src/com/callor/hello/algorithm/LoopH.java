package com.callor.hello.algorithm;

public class LoopH {
	public static void main(String[] args) {
		for(int i = 0 ; i < 30 ; i++) {
			int num = i + 1;
			if(num % 2 == 0) {
				System.out.printf("%3d", num);
			}
		}
	}

}
