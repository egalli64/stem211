package com.example.stem211.camillaLotti.bingo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
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
		int numeroEstratto;
		do {
			numeroEstratto = estrarreNumero();
			System.out.println("NUMERO " + numeroEstratto);
			countEstrazioni++;
		} while (!checkNumbero(numeroEstratto));
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

	public boolean checkNumbero(int numeroEstratto) {
		Arrays.stream(arrayGiocatori).forEach(System.out::println);
		Optional<Giocatore> opt = Arrays.stream(arrayGiocatori).filter(g -> g.checkCartelle(numeroEstratto)).findAny();
		opt.ifPresent(g -> {
			System.out.println(g.getNome() + " ha vinto");
		});
		return opt.isPresent();
		
//		for (int i = 0; i < arrayGiocatori.length; i++) {
//			System.out.println(arrayGiocatori[i].toString());
//			if (arrayGiocatori[i].checkCartelle(numeroEstratto)) {
//				System.out.println(arrayGiocatori[i].getNome() + " ha vinto");
//				return true;
//			}
//		}
//		return false;
	}
}
