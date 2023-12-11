package com.callor.score.exec;

import com.callor.score.service.ScoreService;

public class ScoreExecA {
	
	public static void main(String[] args) {
		ScoreService scoreService = new ScoreService();
		scoreService.makeScore(10);

		ScoreService scoreService1 = new ScoreService();
		scoreService1.makeScore(10);

		
		// 잠시 멈춘상태
	}

}
