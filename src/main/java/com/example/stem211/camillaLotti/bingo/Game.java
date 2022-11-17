package com.example.stem211.camillaLotti.bingo;

public class Game {
	public static void main(String[] args) {

		if (args.length < 2 || Integer.parseInt(args[0]) != args.length - 1) {
			System.out.println("Non ci sono abbastanza argomenti");
			return;
		}

		int numeroGiocatori = Integer.parseInt(args[0]);
		int[] numeroCartelle = new int[numeroGiocatori];
		for (int i = 1; i < args.length; i++) {
			numeroCartelle[i - 1] = Integer.parseInt(args[i]);
		}

		Banco banco = Banco.creaBanco(numeroGiocatori);
		banco.iniziaGioco(banco, numeroGiocatori, numeroCartelle);
	}
}
