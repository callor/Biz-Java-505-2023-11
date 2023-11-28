package com.callor.hello.method;

public class MethodGA {
	
	/*
	 * num 라는 값을 전달받아서
	 * prime 인지 검사하고 prime 이면 true, 아니면 false를
	 * return 하겠다 라는 선언
	 */
	public static boolean isPrime(int num) {
		int index = 0;
		for(index = 2; index < num ; index++) {
			if(num % index == 0) {
				break;
			}
		}
		if(index < num) {
			return false;
		} else {
			return true;
		}
	}
	
	public static void main(String[] args) {
		int num = (int)(Math.random() * 100) + 2;
		boolean isPrime = isPrime(num);
		if(isPrime) {
			System.out.println(num + " 는 소수야!!");
		} else {
			System.out.println(num + " 는 소수가 아니야@@@");
		}
	}

}
