package com.example.stem211.camillaLotti.bingo;

import java.util.ArrayList;
import java.util.Random;

public class Banco {
	private Giocatore[] arrayGiocatori;
	private ArrayList<Integer> sacchettoNumeri;

	private Banco(int numeroGiocatori) {
		this.arrayGiocatori = new Giocatore[numeroGiocatori];
	}
	
	public static Banco creaBanco(int numeroGiocatori) {
		Banco banco = new Banco(numeroGiocatori);
		banco.creaSacchettoNumeri();
		return banco;
	}

	public void iniziaGioco(Banco banco, int numeroGiocatori, int[] numeroCartelle) {
		Generatore generatore = Generatore.creaGeneratore();
		for (int i = 0; i < numeroGiocatori; i++) {
			StringBuilder nomeGiocatore = new StringBuilder();
			nomeGiocatore.append("giocatore_" + i);
			Giocatore giocatore = Giocatore.creaGiocatore(nomeGiocatore.toString(), numeroCartelle[i], generatore);
			arrayGiocatori[i] = giocatore;
		}

		int countEstrazioni = 0;
		do {
			int numeroEstratto = estrarreNumero();
			System.out.println("Numero estratto " + numeroEstratto);
			checkNumbero(numeroEstratto);
			countEstrazioni++;
		} while (!checkCinquina());
		System.out.println("Numero estrazioni: " + countEstrazioni + "/" + Generatore.getNumeroMassimo());
	}

	public void creaSacchettoNumeri() {
		this.sacchettoNumeri = new ArrayList<Integer>();
		for (int i = 0; i < Generatore.getNumeroMassimo(); i++) {
			sacchettoNumeri.add(i);
		}
	}

	public int estrarreNumero() {

		if (sacchettoNumeri.size() == 0) {
			return -1;
		}

		Random random = new Random();
		int numeroRandom = random.nextInt(sacchettoNumeri.size());
		int numeroEstratto = sacchettoNumeri.get(numeroRandom);
		sacchettoNumeri.remove(numeroRandom);

		return numeroEstratto;
	}

	public void checkNumbero(int numeroEstratto) {
		for (int i = 0; i < arrayGiocatori.length; i++) {
			arrayGiocatori[i].checkCartelle(numeroEstratto);
			System.out.println(arrayGiocatori[i].toString());
		}
	}

	public boolean checkCinquina() {
		for (int i = 0; i < arrayGiocatori.length; i++) {
			if (arrayGiocatori[i].checkCinquina()) {
				System.out.println(arrayGiocatori[i].getNome() + " ha vinto");
				return true;
			}
		}
		return false;
	}
}