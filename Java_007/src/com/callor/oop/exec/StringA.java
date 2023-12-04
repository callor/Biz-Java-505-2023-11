package com.callor.oop.exec;

public class StringA {
	
	public static void main(String[] args) {
		
		String nation = "대한민국 우리나라만세";
		
		// 문자열변수(nation)에 저장된 문자열 데이터의 길이
		System.out.println(nation.length());
		
		// 문자열 일부를 잘라서 다른 변수에 할당하기
		// nation 변수에 저장된 문자열을 0,1,2 번째를 잘라내고
		// 6 번째 이후를 잘라낸 나머지 문자열을 subStr 에 저장
		String subStr = nation.substring(3,6);
		System.out.println(subStr);
		
		nation = "Republc of Korea";
		// nation 변수에 저장된 문자열을 모두 대문자로
		System.out.println(nation.toUpperCase());
		
		// nation 변수에 저장된 문자열을 모두 소문자로
		System.out.println(nation.toLowerCase());
		
		nation = "우리,나라,대한,민국,만세";
		// 어떤 문자열을 매개변수로 전달받아
		// nation 문자열에 저장된 데이터를 가공하고(요리하고)
		// 결과를 문자열 배열로 return 하여
		// result 문자열 배열에 할당하기
		String[] result = nation.split(",");
		for(int i = 0 ; i < result.length ; i++) {
			System.out.println(result[i]);
		}
		
	}

}
