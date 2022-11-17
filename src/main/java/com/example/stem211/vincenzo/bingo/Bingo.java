package com.example.stem211.vincenzo.bingo;

public class Bingo {

	public static void main(String[] args) {

		int nGiocatori = Integer.valueOf(args[0]);
		int[] nRighe = new int[nGiocatori];
		for (int j = 1; j < args.length; j++) {
			nRighe[j - 1] = Integer.valueOf(args[j]) * 3;
		}

		Cartella cartella = new Cartella(nGiocatori, nRighe);
//		int[][][] card = cartella.creazione(nGiocatori, nRighe);
		Estrazione estrazione = new Estrazione();
		int k = estrazione.verifica(nGiocatori, nRighe, cartella);
		System.out.println("Il vincitore è il giocatore " + k);
	}
}