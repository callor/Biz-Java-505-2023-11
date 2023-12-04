package com.callor.oop.exec;

import com.callor.oop.service.ScoreService;

public class ScoreA {
	
	public static void main(String[] args) {
		
		// ScoreService 클래스를 사용하여
		// 철수성적, 영희성적, 민수성적 이라는 "객체"를 선언했다
		// 일종의 변수를 선언한 것
		// 각각의 객체를 생성자(new) method 를 사용하여
		// 초기화 하였다
		// 이 코드가 실행되면 철수성적, 영희성적, 민수성적 객체는
		// 인스턴스 화(化) 되었다
		ScoreService 철수성적 = new ScoreService();
		ScoreService 영희성적 = new ScoreService();
		ScoreService 민수성적 = new ScoreService();
		
		
		철수성적.scoreKor = 90;
		철수성적.scoreEng = 80;
		
		영희성적.scoreKor = 70;
		영희성적.scoreEng = 100;
		
		민수성적.scoreKor = 80;
		민수성적.scoreEng = 90;
		
		System.out.println(철수성적.scoreKor + 철수성적.scoreEng);
				
		
	}

}
