package com.example.stem211.alberto.bingo;

public class Player {
	private String name;
	private int indiceCartella;
	private Cartella[] cartelle;

	public Player(String name, int numCartelle) {
		this.name = name;
		Generatore generatore = new Generatore();
		this.cartelle = new Cartella[numCartelle];
		for (int i = 0; i < numCartelle; i++) {
			cartelle[i] = new Cartella(generatore);
			this.indiceCartella++;
		}
	}

	public boolean checkVittoria(int estrazione) {
		boolean flag = false;
		for (int i = 0; i < indiceCartella; i++) {
			flag = this.cartelle[i].checkCinquina(estrazione);
		}
		return flag;
	}

	public String getName() {
		return name;
	}
}
