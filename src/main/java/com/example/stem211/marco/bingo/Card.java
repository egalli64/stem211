package com.example.stem211.marco.bingo;

import java.util.Random;

public class Card {

	private int count = 0;
	private int[] nCards;
	private int[] numbers;

	public Card(int nCards[], int[] numbers) {
		this.nCards = new int[15];
		this.numbers = new int[90];
		Card.count += 1;
	}

//	Voglio creare k cartelle

	public void shuffle(int[] numbers) {
		Random random = new Random();

		for (int i = 0; i < numbers.length; i++) {
			int j = random.nextInt(numbers.length);
			int temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
		}
	}

	public int[] totcard() {
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < nCards.length; j++) {
				int n = nCards.length * count;
				nCards[i] = numbers[n];
				n++;
			}
			count++;
		}
		
//		int[]card1 = new int[15];
//		int[]card2 = new int[15];
//		int[]card3 = new int[15];
//		int[]card4 = new int[15];
//		int[]card5 = new int[15];
//		int[]card6 = new int[15];
//		
//		int count = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 0; j < nCards.length; j++) {
//				int n = nCards.length * count;
//				nCards[i] = numbers[n];
//				n++;
//			}
//			count++;
//		}
	}

}
