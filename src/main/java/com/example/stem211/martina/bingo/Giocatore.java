package com.example.stem211.martina.bingo;

public class Giocatore {
//	private static int count = 0;
	private String name;
	private int numeroCartelle;
	public int[] myCartella;

	public Giocatore(String name, int numeroCartelle) {
		this.name = name;
//		Giocatore.count += 1;
		this.numeroCartelle = numeroCartelle;

		Cartella myCartella1 = new Cartella(numeroCartelle);
		myCartella=myCartella1.getNumeriCartella();

	}

//	public static int getCount() {
//		return Giocatore.count;
//	}

	public String getName() {
		return name;
	}
	public int getNumeroCartelle() {
		return numeroCartelle;
	}

	public int[] getMyCartella() {
		return myCartella;
	}

}
