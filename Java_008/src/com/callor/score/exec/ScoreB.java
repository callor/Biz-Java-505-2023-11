package com.callor.score.exec;

import com.callor.score.service.ScoreService;

public class ScoreB {
	
	public static void main(String[] args) {
		ScoreService scoreService = new ScoreService();
		scoreService.loadScores();
		scoreService.printScores();
	}
}
