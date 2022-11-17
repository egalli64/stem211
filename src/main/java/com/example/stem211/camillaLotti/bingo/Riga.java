package com.example.stem211.camillaLotti.bingo;

import java.util.Arrays;

public class Riga {
	private int[] array;
	private int countNumeroTrovato;

	public Riga(int[] array) {
		this.array = array;
	}

	public void checkSingoliNumeri(int numeroEstratto) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numeroEstratto) {
				countNumeroTrovato++;
			}
		}
	}

	public boolean checkCinquina() {
		for (int i = 0; i < array.length; i++) {
			if (countNumeroTrovato == 5) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "\nRiga{" + Arrays.toString(array) + " count= " + countNumeroTrovato + '}';
	}
}