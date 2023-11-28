package com.callor.hello.prime;

public class PrimeHA {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i < 100; i++) {
			int num = i + 1; // i 값은 1 ~ 99까지 인데, 
							 // 2 ~ 100까지로 변환
			int index = 0;
			for (index = 2; index < num; index++) {
				if (num % index == 0) {
					break;
				}
			} // end 소수검사
			
//		if(index < num) {
//			// prime 아니다
//		} else {
//			System.out.println(num + "는 소수");
//		}
			if (index >= num) {
				System.out.println(num + "는 소수");
				sum += num;
			}

		} // end for 전체
		System.out.printf("2 ~ 100까지 수 중 소수들의 합 : %d \n",sum);
	} // end main
}
