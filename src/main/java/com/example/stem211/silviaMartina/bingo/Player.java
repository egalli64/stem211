package com.example.stem211.silviaMartina.bingo;

public class Player {
	private Card[] cards;
	//private Generator[] generator;

	public Player(int nCards) {
		this.cards = new Card[nCards];
		for (int i = 0; i < cards.length; i++) {
			cards[i] = new Card();

		}
	}

}
