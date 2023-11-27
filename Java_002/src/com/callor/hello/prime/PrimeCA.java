package com.callor.hello.prime;

public class PrimeCA {
	public static void main(String[] args) {
		int num = 9;
		boolean noPrime = false;
		int index = 0;
		for(index = 2 ; index < num ; index++) {
			if(num % index == 0) {
				// prime 이 아니다
				noPrime =  true;
				break;
			}
		}
		if(noPrime) {
			System.out.printf("%d MOD %d = %d, ",
						num, index, num % index);
			System.out.println(num + " 는 소수가 아님");
		} else {
			System.out.println(num + " 는 소수임");
		}
	}

}
