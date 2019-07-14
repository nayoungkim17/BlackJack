package com.nayoung.blackjack;

public class Role {
	public static int calcScore(Gamer g) {
		int sum = g.openCards(false);
		System.out.printf("���� : %d\n", sum);
		return sum;
	}

	public static void whoIsWin(Gamer g, Dealer d) {
		int gamerSum = calcScore(g);
		int dealerSum = calcScore(d);
		
		if(gamerSum > 21 && dealerSum > 21 || gamerSum  == dealerSum) {
			System.out.println("������ �̰���ϴ�.");
		} else if(gamerSum < 21) {
			System.out.println("���̸Ӱ� �̰���ϴ�.");
		}
	}
}
