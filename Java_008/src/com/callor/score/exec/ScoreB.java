package com.callor.score.exec;

import com.callor.score.service.ScoreServiceA;

public class ScoreB {
	
	public static void main(String[] args) {
		ScoreServiceA scoreService = new ScoreServiceA();
		scoreService.loadScores();
		scoreService.printScores();
	}
}
