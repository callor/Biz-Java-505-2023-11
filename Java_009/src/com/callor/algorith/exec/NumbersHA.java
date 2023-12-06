package com.callor.algorith.exec;

import com.callor.algorith.service.NumberService;
import com.callor.algorith.utils.Line;

public class NumbersHA {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		
		Line.dLine(50);
		System.out.println("3과목의 점수를 입력하세요");
		int score1 = numService.inputNum("첫 번째 과목점수");
		int score2 = numService.inputNum("두 번째 과목점수");
		int score3 = numService.inputNum("세 번째 과목점수");
		
		int total = score1 + score2 + score3;
		float avg = (float)total / 3;
		
		if(avg >= 60) {
			System.out.println("축하합니다\n합격입니다");
		} else {
			System.out.println("아쉽지만\n낙제입니다");
		}
		
		
		
	}

}
