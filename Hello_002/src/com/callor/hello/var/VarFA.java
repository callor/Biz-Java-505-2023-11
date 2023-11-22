package com.callor.hello.var;

public class VarFA {
	public static void main(String[] args) {
		float scoreKor = 0;
		float scoreEng = 0;
		float scoreMath = 0;
		float total = 0;
		float avg = 0;
		
		scoreKor = 80.2f;
		scoreEng = 70.3f;
		scoreMath = 80.3f;

		total = scoreKor;
		total = total + scoreEng;
		total = total + scoreMath;
		avg = total / 3;
		
		System.out.println("==============");
		System.out.print("국어 : ");
		System.out.println(scoreKor);
		
		System.out.print("영어 : ");
		System.out.println(scoreEng);
		
		System.out.print("수학 : ");
		System.out.println(scoreMath);
		System.out.println("--------------");
		System.out.print("총점 : ");
		System.out.println(total);
		System.out.print("평균 : ");
		System.out.println(avg);
		System.out.println("==============");
	}
}
