package com.example.stem211.camillaLotti.bingo;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Riga {
	private int[] array;
	private int countNumeroTrovato;

	public Riga(int[] array) {
		this.array = array;
	}

	public boolean checkSingoliNumeri(int numeroEstratto) {
		if(IntStream.of(array).filter(s -> s == numeroEstratto).findAny().isPresent()) {
			countNumeroTrovato++;
			if (countNumeroTrovato == 5) {
				return true;
			}
		}
		
//		for (int i = 0; i < array.length; i++) {
//			if (array[i] == numeroEstratto) {
//				countNumeroTrovato++;
//				if (countNumeroTrovato == 5) {
//					return true;
//				}
//			}
//		}
		return false;
	}

	@Override
	public String toString() {
		return "\nRiga{" + Arrays.toString(array) + " count= " + countNumeroTrovato + '}';
	}
}
