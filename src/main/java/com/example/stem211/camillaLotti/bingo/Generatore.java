package com.example.stem211.camillaLotti.bingo;

import java.util.Random;

public class Generatore {
	private int[] numeri;
	private final static int NUMERO_MASSIMO = 90;

	private Generatore() {
		this.numeri = new int[NUMERO_MASSIMO]; // meglio scrivere Generatore.NUMERO_MASSIMO ?
	}
	
	public static Generatore creaGeneratore() {
		Generatore generatore = new Generatore();
		generatore.generaNumeri();
		return generatore;
	}

	public void generaNumeri() {
		for (int i = 0; i < NUMERO_MASSIMO; i++) {
			numeri[i] = i + 1;
		}
	}

	public void shuffle() {
		Random random = new Random();

		for (int i = 0; i < numeri.length; i++) {
			int j = random.nextInt(numeri.length);
			int temp = numeri[i];
			numeri[i] = numeri[j];
			numeri[j] = temp;
		}
//		System.out.println(Arrays.toString(numeri));
	}

	public int[][] dareNumeriPerNCartelle(int numeroCartelle) {
		int[][] result = new int[Cartella.getNumeroRighe() * numeroCartelle][Cartella.getNumeroColonne()];
		int countElemento = 0;
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				result[i][j] = numeri[countElemento];
				countElemento++;
			}
		}
		return result;
	}

	public static int getNumeroMassimo() {
		return NUMERO_MASSIMO;
	}
}
