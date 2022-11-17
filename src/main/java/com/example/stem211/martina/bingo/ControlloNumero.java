package com.example.stem211.martina.bingo;

public class ControlloNumero {

	// ---------------DATA MEMBERS-------------------------------------------------
	private int[][] tabella;
	private int[] cart;

	// --------------CONSTRUCTOR-----------------------------------------------------
	public ControlloNumero(String name, int[] numeriGame, int numeroEstratto) {
		tabella = tab(numeriGame);
		int i = 0;
		int j = 0;
		for (int[] rig : tabella) {
			j = 0;
			for (int k : rig) {
				if (k == numeroEstratto) {
					tabella[i][j] = 0;
					System.out.println(name + " ha il numero estratto");
					break;
				}
				j += 1;
			}
			i += 1;
		}
		cart = ritornTab(numeriGame.length, tabella);

	}

	// ------------------GETTER-----------------------------------------------
	public int[] getNewCartella() {
		return cart;
	}

	// ----------------------METODI-------------------------------------------
	public int[] ritornTab(int lunghezza, int[][] tab1) {
		int[] copia = new int[lunghezza];
		for (int i = 0; i < lunghezza / 5; i++) {
			for (int j = 0; j < 5; j++) {
				copia[i * 5 + j] = tab1[i][j];
			}
		}
		return copia;
	}

	
	
	public int[][] tab(int[] numeri) {
		int numerorighe = numeri.length / 5;
		int[][] matrice = new int[numerorighe][5];

		for (int i = 0; i < numerorighe; i++) {
			for (int j = 0; j < 5; j++) {
				matrice[i][j] = numeri[5 * i + j];
			}
		}
		return matrice;
	}

}
