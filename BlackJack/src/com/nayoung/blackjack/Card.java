package com.nayoung.blackjack;

public class Card {
	public static final String[] shapes = { "spade", "heart", "clover", "diamond" };
	public static final String[] markers = { "A", "J", "Q", "K" };
	public static final int MAX_NO = 13;

	private String shape; // spade, heart, clover, diamond
	private String marker; // A, 2~10, J, Q, k
	private int score;

	@Override
	public String toString() {
		return shape + " : " + marker + " : " + score;
	}
	public Card(String shape, int no) {
		setShape(shape);
		createMarkerScore(no);
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		for (int i = 0; i < shapes.length; i++) {
			if (shape.equals(shapes[i])) {
				this.shape = shape;
				return; // 중요중요 없으면 항상 null.
			}
		}
		this.shape = null;
		// return; void이라도 이게 자동으로 항상 들어감.
	}

	public String getMarker() {
		return marker;
	}

	private void createMarkerScore(int no) {
		if (no == 1) {
			setMarker("A");
			setScore(no);

		} else if (no >= 2 && no <= 10) {
			String sNo = Integer.toString(no);
			setMarker(sNo);
			setScore(no);

		} else if (no == 11) {
			setMarker("J");
		} else if (no == 12) {
			setMarker("Q");
		} else if (no == 13) {
			setMarker("K");
		} else {
			setScore(10);
			setMarker("");
		}
	}

	public void setMarker(String marker) { // 1~13 스트링

		this.marker = marker;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
