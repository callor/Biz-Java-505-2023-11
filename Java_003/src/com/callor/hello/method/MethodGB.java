package com.callor.hello.method;

public class MethodGB {
	public static boolean isPrime(int num) {
		int index = 0;
		boolean isPrime = true;
		for(index = 2; index < num ; index++) {
			if(num % index == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
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
