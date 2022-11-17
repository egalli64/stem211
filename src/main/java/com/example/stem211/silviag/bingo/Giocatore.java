package com.example.stem211.silviag.bingo;

public class Giocatore {
	private Cartella[] cards;
	
	public Giocatore(int nCards) {
		this.cards = new Cartella[nCards];
		for(int i = 0; i < cards.length;  i++) {
			cards[i] = new Cartella();
		}
	}
}
