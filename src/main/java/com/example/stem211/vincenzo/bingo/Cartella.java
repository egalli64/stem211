package com.example.stem211.vincenzo.bingo;

public class Cartella {

	private int[][][] card;
	private Generator generator;

	public Cartella(int nGiocatori, int[] nRighe) {
		this.generator = new Generator();
		this.card = new int[nGiocatori][18][6];
		for (int k = 0; k < nGiocatori; k++) {
			int count = 0;
			int[] numbers = generator.shuffle();
			for (int i = 0; i < nRighe[k]; i++) {
				for (int l = 0; l < 5; l++) {
					this.card[k][i][l] = numbers[count];
					count++;
				}
			}
		}
	}
	/**
	 * TODO: rivedere completamente!
	 * 
	 * @return
	 */
	public int [][][] getCard(){
		return card;
	}
}
