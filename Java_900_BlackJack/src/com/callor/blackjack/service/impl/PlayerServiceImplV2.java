package com.callor.blackjack.service.impl;

import com.callor.blackjack.models.CardDto;
import com.callor.blackjack.utils.Line;

public class PlayerServiceImplV2  extends PlayerServiceImplV1{

	public PlayerServiceImplV2() {
		super("딜러");
	}
	public PlayerServiceImplV2(String playerName) {
		super(playerName);
	}
	
	@Override
	public void showCard() {
		
		if(myCardList.isEmpty()) {
			System.out.println("현재 보유중인 카드 없음");
			return;
		}
		
		Line.dLine(100);
		System.out.printf("%s, 받은카드 : %d, %d점\n",
				this.playerName, this.myCardList.size(),
				this.getScore()
				);
		Line.sLine(100);
		
		// 카드 한장을 그리는데 필요한 라인수
		int patternsCount = myCardList.get(0).getPatterns().length;
		for(int lines = 0 ; lines < patternsCount ; lines++) {
			for(CardDto dto : myCardList) {
				
				// String line = dto.getPatterns()[lines];
				String line = dto.getPattern(lines);
				System.out.printf("%10s",line);
				
			}
			System.out.println();
		}
	}

}
