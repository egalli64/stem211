package com.example.stem211.vincenzo.bingo;

import java.util.Random;

public class Generator {
	private static final int MAX_NUMBER = 90;
	private int[] numbers;
	private int pos;

	public Generator() {
		this.numbers = new int[MAX_NUMBER];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
	}

	public int[] shuffle() {
		Random random = new Random();

		for (int i = 0; i < numbers.length; i++) {
			int j = random.nextInt(numbers.length);
			int temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
		}
		pos = 0;
		return numbers;
//		System.out.println(Arrays.toString(numbers));
	}

	public int getNumber() {
		int result = numbers[pos];
		pos++;
		return result;
	}
}
