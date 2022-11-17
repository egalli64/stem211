package com.example.stem211.martina.bingo;

import java.util.Random;

public class Cartella {
	public int[] numeriCartella;
	public int[] numeriBingo;

	public Cartella(int numero) {

		this.numeriBingo = new int[90];
		this.numeriCartella = new int[numero * 3 * 5];

		for (int i = 0; i < 90; i++) {
			numeriBingo[i] = i+1;
		}

		shuffle(numeriBingo);

		for (int j = 0; j < numero * 3 * 5; j++) {
			numeriCartella[j] = numeriBingo[j];

		}
		

	}
	public int[] getNumeriCartella() {
		return numeriCartella;
	}

	public static void shuffle(int[] data) {
		Random random = new Random();

		for (int i = 0; i < data.length; i++) {
			int j = random.nextInt(data.length);
			int temp = data[i];
			data[i] = data[j];
			data[j] = temp;
		}
	}

}
