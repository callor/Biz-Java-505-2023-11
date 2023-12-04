package com.callor.oop.service;

public class ScoreService {
	
	// 클래스 영역에 선언한 변수
	public String stdNum = null;
	
	public int scoreKor = 0;
	public int scoreEng = 0;
	public int scoreMath = 0;
	
	/*
	 * ScoreService 클래스에 
	 * 		getScoreTotal(),getScoreAvg() method 를 선언하고
	 * 		총점과 평균을 각각 계산하여 return 하도록 하고 있다
	 * 		scoreTotal 변수와, scoreAvg 변수는
	 * 		총점과 평균을 계산하는 용도로 사용중이다
	 * 		ScoreService 객체를 통하여 총점과 평균을 
	 * 		참조(읽기)하기 위해서는 getScoreTotal(), getScoreAvg()
	 * 		method 를 통해서만 가능해야 한다
	 * 		scoreTotal, scoreAvg 변수에서 직접 값을 참조(읽기)하면
	 * 		엉뚱한 데이터를 참조할수 있다
	 * 		이때 다른곳에서 변수를 참조하지 못하도록 하기 위하여
	 * 		변수에 private 키워드를 부착한다
	 * 
	 *  private 키워드는 현재 클래스 내에서만 값을 할당, 읽기가
	 *  가능하도록 제한하는 것이다
	 */
	private int scoreTotal = 0;
	private float scoreAvg = 0.0f;
	
	// 정수값을 return 하는 method
	public int getScoreTotal() {
		scoreTotal = scoreKor;
		scoreTotal +=  scoreEng;
		scoreTotal += scoreMath;
		return scoreTotal;
	}
	
	public float getScoreAvg() {
		getScoreTotal();
		scoreAvg = (float)(scoreTotal) / 3;
		return scoreAvg;
	}
	
}




