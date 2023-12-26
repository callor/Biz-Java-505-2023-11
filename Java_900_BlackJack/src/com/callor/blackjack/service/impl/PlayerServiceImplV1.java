package com.callor.blackjack.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.blackjack.models.CardDto;
import com.callor.blackjack.service.PlayerService;

public class PlayerServiceImplV1  implements PlayerService{

	private List<CardDto> myCardList = null;
	public PlayerServiceImplV1() {
		myCardList = new ArrayList<CardDto>();
	}
	
	@Override
	public void hit(CardDto card) {
		myCardList.add(card);
	}

	@Override
	public void showCard() {
		for(CardDto dto : myCardList) {
			System.out.println(dto.toString());
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
