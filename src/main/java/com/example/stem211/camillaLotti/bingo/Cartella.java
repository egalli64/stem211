package com.example.stem211.camillaLotti.bingo;

import java.util.Arrays;
import java.util.stream.Stream;

public class Cartella {
	private Riga[] arrayRighe;
	private final static int NUMERO_RIGHE = 3;
	private final static int NUMERO_COLONNE = 5;
	private final static int NUMERO_NUMERI = 15;

	private Cartella() {
		this.arrayRighe = new Riga[NUMERO_RIGHE];
	}
	
	public static Cartella creaCartella(int[][] numeri) {
		Cartella cartella = new Cartella();
		cartella.riempiCartella(numeri);
		return cartella;
	}

	public void riempiCartella(int[][] numeri) {
		
		for (int i = 0; i < NUMERO_RIGHE; i++) {
			Arrays.sort(numeri[i]);
			Riga riga = new Riga(numeri[i]);
			arrayRighe[i] = riga;
		}
	}

	public boolean checkRighe(int numeroEstratto) {
		return Arrays.stream(arrayRighe).filter(s -> s.checkSingoliNumeri(numeroEstratto)).findAny().isPresent();
		
//		for (int i = 0; i < arrayRighe.length; i++) {
//			if (arrayRighe[i].checkSingoliNumeri(numeroEstratto)) {
//				return true;
//			}
//		}
//		return false;
	}

	public static int getNumeroRighe() {
		return NUMERO_RIGHE;
	}

	public static int getNumeroColonne() {
		return NUMERO_COLONNE;
	}

	public static int getNumeroNumeri() {
		return NUMERO_NUMERI;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("\n");
		Arrays.stream(arrayRighe).forEach(s -> result.append(s.toString()));
//		for (int i = 0; i < arrayRighe.length; i++) {
//			result.append(arrayRighe[i].toString());
//		}
		return result.toString();
	}
}
