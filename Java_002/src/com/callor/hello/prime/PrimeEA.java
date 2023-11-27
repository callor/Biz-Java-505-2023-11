package com.callor.hello.prime;

public class PrimeEA {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			int index = 0;
			boolean noPrime = false;
			int num = (int) (Math.random() * 100) + 2;
			for (index = 2; index < num; index++) {
				if (num % index == 0) {
					noPrime = true;
					break;
				}
			}
			if (noPrime) {
				System.out.println(num + " 는 소수가 아님");
			} else {
				System.out.println(num + " 는 소수임");
			}
		}

	}

}
