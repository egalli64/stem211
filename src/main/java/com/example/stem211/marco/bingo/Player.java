package com.example.stem211.marco.bingo;

public class Player {
	
	private String name;
	private int nCards;
	public int[] curCard;

	
	public Player(String name, int nCards) {
		this.name = name;
		this.nCards = nCards;
	}
	
	public String getName() {
		return name;
	}
	public int getNCards() {
		return nCards;
	}	
}
