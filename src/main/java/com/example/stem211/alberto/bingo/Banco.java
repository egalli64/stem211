package com.example.stem211.alberto.bingo;

public class Banco {
	private int numEstrazioni;
	
	public Banco() {
		this.numEstrazioni = 0;
	}

	public int estrazione() {
		Generatore generatore = new Generatore();
		int num = generatore.generaNumero();
		this.numEstrazioni++;
		return num;
	}
}
