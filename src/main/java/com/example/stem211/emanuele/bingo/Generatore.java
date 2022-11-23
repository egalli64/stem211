//package com.example.stem211.emanuele.bingo;
//
//import java.util.Random;
//
//public class Generatore {
//	private static final int MAX_NUMBER = 90;
//	private int[] numbers;
//	private int pos; // posizione corrente quando mi da un nuovo valore
//
//	public int[] generatore() {
//
//		this.numbers = new int[MAX_NUMBER];
//		for (int i = 0; i < numbers.length; i++) {
//			numbers[i] = i + 1;
//		}
//		return  numbers;
//	}
//
//	public int[] shuffle() {
//		Random random = new Random();
//		pos = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			int j = random.nextInt(numbers.length);
//			int temp = numbers[i];
//			numbers[i] = numbers[j];
//			numbers[j] = temp;
//		}
//		return numbers;
//		
//	}
//
//	public int getNumber() {
//		int result = numbers[pos];
//		pos++;
//		return result;
//
//	}
//}
