package com.example.stem211.silviaMartina.bingo;

import java.util.Arrays;
import java.util.Random;

public class Generator {
	private static final int MAX_NUMBER = 90;
	private int[] numbers;
	private int pos; // posizione_corrente_quando_chiedo_valore

	public Generator() {
		this.numbers = new int[MAX_NUMBER];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
	}

	public void shuffle() {
		Random random = new Random();

		for (int i = 0; i < numbers.length; i++) {
			int j = random.nextInt(numbers.length);
			int temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
		}
		pos = 0;
		System.out.println(Arrays.toString(numbers));
	}

	public int getNumber() {
		// int result = numbers [pos];
		// pos++;
		return numbers[pos++]; // ritornami_pos_dopo_incrementalo
	}

}
