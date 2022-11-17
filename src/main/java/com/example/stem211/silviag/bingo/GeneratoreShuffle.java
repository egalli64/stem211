package com.example.stem211.silviag.bingo;

import java.util.Arrays;
import java.util.Random;

public class GeneratoreShuffle {
	private static final int MAX_NUMBER = 90;
	private int[] numbers;
	private int pos;
	
	public GeneratoreShuffle() {
		this.numbers = new int[90];
		for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
	}
	
	public String shuffle() {
		Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            int j = random.nextInt(numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        pos = 0;
        String stringatotale = Arrays.toString(numbers);
        System.out.println(stringatotale);
		return stringatotale;
	}
	
	public int getNumber() {
		int result = numbers[pos];
		pos++;
		return result; //ritorna il valore in valore pos e poi incrementa pos di 1
	}
}
