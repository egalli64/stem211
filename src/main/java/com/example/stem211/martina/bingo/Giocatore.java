package com.example.stem211.martina.bingo;

public class Giocatore {

	// ---------------DATA MEMEBERS----------------------------------
	private String name;
	private int numeroCartelle;
	private int[] myCartella;

	// --------------------CONSTRUCTOR--------------------------------
	public Giocatore(String name, int numeroCartelle) {
		this.name = name;
		this.numeroCartelle = numeroCartelle;

		Cartella myCartella1 = new Cartella(numeroCartelle);
		myCartella = myCartella1.getNumeriCartella();

	}

	// ------------------GETTER----------------------------------
	public String getName() {
		return name;
	}

	// -----------------------------------------------------------
	public int getNumeroCartelle() {
		return numeroCartelle;
	}

	// ------------------------------------------------------------
	public int[] getMyCartella() {
		return myCartella;
	}

	// ---------------------SETTER-----------------------------------
	public void setMyCartella(int[] newCartella) {
		this.myCartella = newCartella;
	}

}
