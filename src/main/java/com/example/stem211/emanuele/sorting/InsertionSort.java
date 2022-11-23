package com.example.stem211.emanuele.sorting;

import java.util.Arrays;

/*
 * Confronta ogni elemento a partire dal secondo con 
 * quelli precedenti. Se fuori ordine, scambialo con il vicino 
 * di sinistra a trovare il suo posto
 */
public class InsertionSort {
	public static void main(String[] args) {
		int[] array = { -1, 5, 2, 18, -8, 3, -25, 6 };
		System.out.println(Arrays.toString(array));
		sort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (array[j] >= array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				} else {
					break;
				}
			}

		}
	}
}
