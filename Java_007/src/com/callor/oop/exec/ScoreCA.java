package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;

public class ScoreCA {
	
	public static void main(String[] args) {
		ScoreService[] scores = new ScoreService[10];
		scores[0] = new ScoreService();
		
		for(int i = 0 ; i < scores.length ; i++) {
			scores[i] = new ScoreService();
		}
		
		// 10개의 배열의 각 과목점수를 Random으로 생성하고자 한다
		for(int i  = 0 ; i < scores.length; i++) {
			scores[i].scoreKor = (int)(Math.random() * 50) + 51;
			scores[i].scoreEng = (int)(Math.random() * 50) + 51;
			scores[i].scoreMath = (int)(Math.random() * 50) + 51;
		}
		
		// 배열에 저장된 점수 화면에 출력하기
				
		
	}

}
