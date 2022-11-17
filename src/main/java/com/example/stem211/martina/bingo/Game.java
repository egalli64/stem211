package com.example.stem211.martina.bingo;

public class Game {
	public static void main(String[] args) {
		System.out.println("Inizia il gioco!");

		int numeroGiocatori = args.length / 2;

		Giocatore[] gameGiocatori = new Giocatore[numeroGiocatori];

		for (int i = 0; i < numeroGiocatori; i++) {
			gameGiocatori[i] = new Giocatore(args[i], Integer.parseInt(args[numeroGiocatori + i]));
			System.out.println("Giocatori: " + gameGiocatori[i].getName() + "; ha "
					+ gameGiocatori[i].getNumeroCartelle() + " cartelle");

		}
		System.out.println("inizia l'estrazione!");
		Estrazione numeroEstratto=new Estrazione();
		int numeroEst=numeroEstratto.getNumeroEstratto();
		System.out.println("numero estratto: "+  numeroEst);
		
		for (int i=0;i< numeroGiocatori; i++) {
			int[] cartellaGiocatore=gameGiocatori[i].getMyCartella();
			ControlloNumero newCartella=new ControlloNumero(gameGiocatori[i].getName(),cartellaGiocatore,numeroEst);
			
		}
		
	}
}
