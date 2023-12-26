package com.callor.blackjack.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.blackjack.models.CardDto;
import com.callor.blackjack.service.PlayerService;

public class PlayerServiceImplV1  implements PlayerService{

	protected List<CardDto> myCardList = null;
	protected String playerName = "";

	/*
	 * PlayerService 딜러 = new PlayerServiceImplV1() 처럼 생성하면
	 * 		playerName 에 "딜러"라는 값을 할당하라
	 */
	public PlayerServiceImplV1() {
		// new PlayerServiceImplV1("딜러") 처럼 호출하기
		this("딜러");
	}
	public PlayerServiceImplV1(String playerName) {
		myCardList = new ArrayList<CardDto>();
		this.playerName = playerName;
	}
	
	@Override
	public void hit(CardDto card) {
		myCardList.add(card);
	}

	@Override
	public void showCard() {
		for(CardDto dto : myCardList) {
			for(String p : dto.getPatterns()) {
				System.out.println(p);
			}
		}
	}

	@Override
	public int getScore() {

		int score = 0;
		for(CardDto dto : myCardList) {
			score += dto.value;
		}
		return score;
		
	}

}
