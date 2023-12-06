package com.callor.algorith.exec;

import com.callor.algorith.service.NumberService;

public class NumbersGA {

	public static void main(String[] args) {
		NumberService numService = new NumberService();
		int score = numService.inputNum("점수를");

		String scoreGrade = "F";
		if (score >= 95) scoreGrade = "A+";
		else if (score >= 90) scoreGrade = "A";
		else if (score >= 85) scoreGrade = "B+";
		else if (score >= 80) scoreGrade = "B";
		else if (score >= 75) scoreGrade = "C+";
		else if (score >= 70) scoreGrade = "C";
		else if (score >= 65) scoreGrade = "D+";
		else if (score >= 60) scoreGrade = "D";
		System.out.printf("%s 입니다\n",scoreGrade);
		
		if(score >= 80) System.out.println("축하합니다");
		else if(score >= 70) System.out.println("더 분발하세요");
		else if(score < 60) System.out.println("낙제입니다");

	}

}
