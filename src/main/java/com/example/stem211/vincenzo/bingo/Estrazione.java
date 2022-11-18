package com.example.stem211.vincenzo.bingo;

public class Estrazione {

	private Generator generator;

	public Estrazione() {
		generator = new Generator();
	}

	public int verifica(int nGiocatori, int[] nRighe, Cartella cartella) {
		int[][][] card = cartella.getCard();
		while (true) {
			int result = generator.getNumber();
			for (int k = 0; k < nGiocatori; k++) {
				for (int i = 0; i < nRighe[k]; i++) {
					for (int l = 0; l < 5; l++) {
						if (card[k][i][l] == result) {
							card[k][i][l] = 0;
						}
						if (card[k][i][0] == 0 && card[k][i][1] == 0 && card[k][i][2] == 0 && card[k][i][3] == 0
								&& card[k][i][4] == 0) {
							return k + 1;
						}
					}
				}

			}
		}
	}
}
