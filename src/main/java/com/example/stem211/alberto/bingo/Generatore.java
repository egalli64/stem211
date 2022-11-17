package com.example.stem211.alberto.bingo;

import java.util.Arrays;
import java.util.Random;

public class Generatore {
	private int indice;
	private int[] numbers;
	private static final int MAX_NUMBERS = 90;

	public Generatore() {
		this.indice = 0;
		this.numbers = new int[MAX_NUMBERS];
		for (int k = 0; k < numbers.length; k++) {
			numbers[k] = k + 1;
		}
		shuffle();
	}

	public void shuffle() {
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			int j = random.nextInt(numbers.length);
			int temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
		}
	}

	public int[] generaRiga() {
		int[] nuovaRiga = new int[5];
		for (int i = 0; i < nuovaRiga.length; i++) {
			nuovaRiga[i] = this.numbers[indice];
			this.indice++;
		}
		Arrays.sort(nuovaRiga);
		return nuovaRiga;
	}

	public int generaNumero() {
		return numbers[indice++];
	}
}
