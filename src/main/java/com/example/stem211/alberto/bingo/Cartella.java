package com.example.stem211.alberto.bingo;

public class Cartella {

	public int[][] righe;
	private static final int MAX_RIGHE = 3;
	private static final int MAX_COLONNE = 5;
	private int[] count5;

	public Cartella(Generatore gen) {
		righe = new int[MAX_RIGHE][MAX_COLONNE];
		for (int i = 0; i < MAX_RIGHE; i++) {
			righe[i] = gen.generaRiga();
		}
		this.count5= new int[3];
		for (int c = 0; c < count5.length; c++) {
			count5[c] = 0;
		}
	}

	public boolean checkCinquina(int num) {
		for (int i = 0; i < MAX_RIGHE; i++) {
			for (int j = 0; j < MAX_COLONNE; j++)
				if (righe[i][j] == num) {
					count5[i]++;
					if (count5[i] == 5) {
						return true;
					}
				}
		}
		return false;
	}

	public int[][] getRighe() {
		return righe;
	}

}
