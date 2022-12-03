package com.example.stem211.camillaLotti.bingo;

import java.util.Arrays;
import java.util.stream.Stream;

public class Giocatore {
	private String nome;
	private Cartella[] arrayCartelle;
	private Generatore generatore;

	private Giocatore(String nome, int numeroCartelle, Generatore generatore) {
		this.nome = nome;
		this.generatore = generatore;
		this.arrayCartelle = new Cartella[numeroCartelle];
	}

	public static Giocatore creaGiocatore(String nome, int numeroCartelle, Generatore generatore) {
		Giocatore giocatore = new Giocatore(nome, numeroCartelle, generatore);
		generatore.shuffle();
		giocatore.creaCartelle();
		return giocatore;
	}

	public void creaCartelle() {
		int[][] numeri = generatore.dareNumeriPerNCartelle(arrayCartelle.length);

		for (int i = 0; i < arrayCartelle.length; i++) {
			int[][] numeriDaMettereNellaCartella = new int[Cartella.getNumeroRighe()][Cartella.getNumeroColonne()];
			int countElementi = 0;
			for (int j = i * Cartella.getNumeroRighe(); j < (i * Cartella.getNumeroRighe())
					+ Cartella.getNumeroRighe(); j++) {
				numeriDaMettereNellaCartella[countElementi] = numeri[j];
				countElementi++;
			}

			arrayCartelle[i] = Cartella.creaCartella(numeriDaMettereNellaCartella);
		}
	}

	public boolean checkCartelle(int numeroEstratto) {
		return Arrays.stream(arrayCartelle).filter(s -> s.checkRighe(numeroEstratto)).findAny().isPresent();

//		for (int i = 0; i < arrayCartelle.length; i++) {
//			if (arrayCartelle[i].checkRighe(numeroEstratto)) {
//				return true;
//			}
//		}
//		return false;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("\n" + nome);
		Arrays.stream(arrayCartelle).forEach(s -> result.append(s.toString()));
//		for (int i = 0; i < arrayCartelle.length; i++) {
//			result.append(arrayCartelle[i].toString());
//		}
		return result.toString();
	}
}
