package com.callor.student.exec;

import java.util.ArrayList;
import java.util.List;

public class CardView {
	
	public static void main(String[] args) {
		
		String[] cardA = {
			String.format("┌──────┐ "),
			String.format("│  %1s   │ ","◆"),
			String.format("│      │ "),
			String.format("│      │ "),
			String.format("│  %2s  │ ","A"),
			String.format("└──────┘ ")

		};
		String[] cardB = {
				String.format("┌──────┐ "),
				String.format("│  %1s   │ ","♣"),
				String.format("│      │ "),
				String.format("│      │ "),
				String.format("│  %2s  │ ","3"),
				String.format("└──────┘ ")

			};
		String[] cardC = {
				String.format("┌──────┐ "),
				String.format("│  %1s   │ ","♥"),
				String.format("│      │ "),
				String.format("│      │ "),
				String.format("│  %2s  │ ","7"),
				String.format("└──────┘ ")

		};
		
		List<String[]> cardList = new ArrayList<>();
		cardList.add(cardA);
		cardList.add(cardB);
		cardList.add(cardB);
		cardList.add(cardA);
		cardList.add(cardC);
		
		// for(int list = 0 ; list < cardList.size() ; list ++ ) {
		//	for(int card = 0 ; card < cardList.get(list).length ;  card++) {
		//		System.out.println(cardList.get(list)[card]);
		//	}
		// }
		
		int cardLine = cardA.length;
		for(int arr = 0 ; arr < cardLine ; arr++) {
			int cardCount = cardList.size();
			for(int list = 0 ; list < cardCount ; list++) {
				String[] card = cardList.get(list);
				System.out.print(card[arr] + "\t");
			}
			System.out.println();
		}
	}
	

}
