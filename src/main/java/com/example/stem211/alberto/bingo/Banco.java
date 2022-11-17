package com.example.stem211.alberto.bingo;

public class Banco {
	private int numEstrazioni;
	private Generatore gen;
	
	public Banco() {
		this.numEstrazioni = 0;
		this.gen = new Generatore();
	}

	public int estrazione() {
		int num = gen.generaNumero();
		this.numEstrazioni++;
		return num;
	}
}
