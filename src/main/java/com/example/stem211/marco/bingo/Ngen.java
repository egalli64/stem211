package com.example.stem211.marco.bingo;

import java.util.Arrays;
import java.util.Random;

public class Ngen {

	private static final int MAX_NUMBER = 90;
	private int[] numbers;
	private int pos;

	public Ngen() {
		this.numbers= new int[MAX_NUMBER];
		for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
	}

	public void shuffle() {
		pos = 0;
		Random random = new Random();

		for (int i = 0; i < numbers.length; i++) {
			int j = random.nextInt(numbers.length);
			int temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
		}
		System.out.println(Arrays.toString(numbers));
	}

	public int getNumber() {
		int result = numbers[pos];
		pos++;
		return result;

	}
}
