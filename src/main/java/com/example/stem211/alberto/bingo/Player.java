package com.example.stem211.alberto.bingo;

public class Player {
	private String name;
	private int numCartelle;
	private int indiceCartella;
	private static final int MAX_CARTELLE = 6;

	public Player(String name, int numCar) {
		this.name = name;
		this.numCartelle = numCar;
		Generatore generatore = new Generatore();
		Cartella[] card = new Cartella[MAX_CARTELLE];
		for (int i = 0; i < numCartelle; i++) {
			card[i] = new Cartella(generatore);
			this.indiceCartella++;
		}
	}

	public boolean checkVittoria() {
		boolean flag=false;
		for(int i=0; i<indiceCartella; i++) {
			
		}
		return flag;
	}
	
	public String getName() {
		return name;
	}
}
