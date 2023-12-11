package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.models.ScoreDto;
import com.callor.score.utils.Line;

/*
 * random 값으로 51 ~ 100까지 점수를 생성하여
 * ScoreDto 의 각 과목 요소에 할당하고
 * List<ScoreDto> 에 추가하기
 */
public class ScoreServiceV1 {
	
	/*
	 * ScoreServiceV1 을 상속(extends) 하고 싶다
	 * 이때 V1 에 선언된 public method 는 별다른 코드변경 없이
	 * V2 에서 그대로 사용할수 있다
	 * 하지만 private 으로 선언된 변수는 상속이 안된다
	 * scores 객체를 V2 에서 사용하기 위하여
	 * protected 로 변경해 준다
	 */
	protected List<ScoreDto> scores = null;

	public ScoreServiceV1() {

		// 생성자에서 아래와 같이 scores 를 생성하면
		// 생성자를 벗어난 후 scores 는 소멸된다
		// 클래스 영역에 선언된 scores 는 여전히 null 이다
		// List<ScoreDto> scores = new ArrayList<ScoreDto>();

		// 클래스 영역에 선된 scores 를 생성하는 코드
		scores = new ArrayList<ScoreDto>();

	}

	// 학생 한명의 학번, 과목별 점수를 임의 생성하여
	// scores 에 추가하는 method
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
	
	// count 변수에 정수값을 전달받아
	// count 만큼 makeScore() 호출하여
	// count 만큼 성적데이터를 생성하고 scores 에 추가
	public void makeScore(int count) {
		for(int i = 0 ; i < count; i++) {
			this.makeScore();
		}
	}
	
	public void printScore() {
		
		Line.dLine(100);
		System.out.println("한울 고교 새별반 성적표");
		Line.dLine(100);
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\t총점\t평균");
		Line.sLine(100);
		
		// for(int i = 0 ; i < scores.size();i++) {
		//	ScoreDto dto = scores.get(i);
		// }
		
		// scores 에서 index 번째 요소를 get 하여 dto 클래스 변수에
		// 담아주는 일까지 한번에 처리
		for(ScoreDto dto : scores) {
			System.out.printf("%s\t",dto.stdNum);
			
			System.out.printf("%4d\t",dto.kor);
			System.out.printf("%4d\t",dto.eng);
			System.out.printf("%4d\t",dto.math);
			System.out.printf("%4d\t",dto.music);
			System.out.printf("%4d\t",dto.art);
			
			System.out.printf("%4d\t",dto.getTotal());
			System.out.printf("%.2f\n",dto.getAvg());
		}
		Line.sLine(100);
		
	} // end printScore()
	
	
	

} // class ScoreService
