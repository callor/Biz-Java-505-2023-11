package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.models.ScoreDto;

/*
 * random 값으로 51 ~ 100까지 점수를 생성하여
 * ScoreDto 의 각 과목 요소에 할당하고
 * List<ScoreDto> 에 추가하기
 */
public class ScoreService {

	private List<ScoreDto> scores = null;

	public ScoreService() {

		// 생성자에서 아래와 같이 scores 를 생성하면
		// 생성자를 벗어난 후 scores 는 소멸된다
		// 클래스 영역에 선언된 scores 는 여전히 null 이다
		// List<ScoreDto> scores = new ArrayList<ScoreDto>();

		// 클래스 영역에 선된 scores 를 생성하는 코드
		scores = new ArrayList<ScoreDto>();

	}

	public void makeScore() {

		int kor = (int) (Math.random() * 51) + 50;
		int eng = (int) (Math.random() * 51) + 50;
		int math = (int) (Math.random() * 51) + 50;
		int music = (int) (Math.random() * 51) + 50;
		int art = (int) (Math.random() * 51) + 50;

		/*
		 * 학번을 자동으로 생성하기 
		 * 1. scores 에 추가된 성적표가 있는가 확인 
		 * 2. 없으면 최초의 성적 이므로 230001 로 학번을 세팅
		 * 3. 있으면 가장 마지막 성적표의 학번을 조회하여 
		 * 		학번을 + 1 하여 새로운 학번을 생성하기
		 */
		String strStdNum = "23001";
		int scoresSize = scores.size();
		if (scoresSize > 0) {
			ScoreDto dto = scores.get(scoresSize - 1);
			strStdNum = dto.stdNum;

			strStdNum = strStdNum.substring(2);
			int intStdNum = Integer.valueOf(strStdNum);
			intStdNum++;
			strStdNum = String.format("23%03d", intStdNum);
		}

		// 한 학생의 성적표를 생성하는 과정
		ScoreDto scoreDto = new ScoreDto();
		scoreDto.stdNum = strStdNum;
		scoreDto.kor = kor;
		scoreDto.eng = eng;
		scoreDto.math = math;
		scoreDto.music = music;
		scoreDto.art = art;
		scores.add(scoreDto);
	} // end makeScore()
	
	public void makeScore(int count) {
		for(int i = 0 ; i < count; i++) {
			this.makeScore();
		}
	}
	
	
	

} // class ScoreService
