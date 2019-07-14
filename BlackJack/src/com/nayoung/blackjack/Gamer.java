package com.nayoung.blackjack;

import java.util.List;
import java.util.ArrayList;

public class Gamer {
	private List<Card> myCards = new ArrayList();

	// ī������ޱ�
	public void setCard(Card c) {
		myCards.add(c);

	}

	// ī�����
	public int openCards(boolean isShow) {
		int sum = 0;
		for (Card c : myCards) {
			sum += c.getScore();
			if (isShow) {
				System.out.println(c);
			}
		}
		return sum;
	}

}
