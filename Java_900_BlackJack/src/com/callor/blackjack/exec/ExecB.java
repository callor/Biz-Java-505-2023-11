package com.callor.blackjack.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.blackjack.models.CardDto;

public class ExecB {
	
	public static void main(String[] args) {
		
		List<CardDto> cardList = new ArrayList<CardDto>();
		
		String strSuit = "◆♤♣♡";
		String strDenomi = "A234567890KQJ";
		
		// String[] suits = ["◆","♤","♣","♡"]; 
		String[] suits = strSuit.split("");
		String[] denomis = strDenomi.split("");
		
		for(String suit : suits) {
			for(String deno : denomis) {
				
				int value = 0;
				try {
					value = Integer.valueOf(deno);
				} catch (Exception e) {
					// TODO: handle exception
					// deno 값이 AKQJ 일 경우 exception 이 발생한다
					if(deno.equals("A")) value = 1;
					else value = 10;
				}
				if(value == 0) value = 10;
//				System.out.printf("%s, %s, %d\n",suit, deno,value);

				CardDto cardDto = new CardDto();
				cardDto.suit = suit;
				cardDto.denomiation = deno;
				cardDto.value = value;
				
				cardList.add(cardDto);
				
			}
		}
				
		
		
		
		
		
	}

}
