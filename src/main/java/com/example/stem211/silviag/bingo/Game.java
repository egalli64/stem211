package com.example.stem211.silviag.bingo;

public class Game {
	public static void main(String[] args) {
		System.out.println("Inizia il gioco!");
		System.out.println("");

		int numeroGiocatori = args.length / 2;
		boolean continua=false;

		//creo lo spazio per i miei Giocatori
		Giocatore[] gameGiocatori = new Giocatore[numeroGiocatori];

		//definisco i miei Giocatori con le loro Cartelle
		for (int i = 0; i < numeroGiocatori; i++) {
			gameGiocatori[i] = new Giocatore(args[i], Integer.parseInt(args[numeroGiocatori + i]));
			System.out.println("Giocatori: " + gameGiocatori[i].getName() + "; ha "
					+ gameGiocatori[i].getNumeroCartelle() + " cartelle");

		}
		
		System.out.println("");
		System.out.println("inizia l'estrazione!");
		System.out.println("");
		
		Estrazione numeroEstratto=new Estrazione();
		int numeroEst;
		
		//continua il loop finchè non trovo un vincitore
		while (continua==false) {
			numeroEstratto.setCount();
			numeroEst=numeroEstratto.getNumeroEstratto();
			System.out.println("numero estratto: "+  numeroEst);


			for (int i=0;i< numeroGiocatori; i++) {
				int[] cartellaGiocatore=gameGiocatori[i].getMyCartella();
				
				//controllo se il numero estratto c'è nei numeri del giocatore 
				ControlloNumero newCartella=new ControlloNumero(gameGiocatori[i].getName(),cartellaGiocatore,numeroEst);
				
				//modifico la cartella del giocatore siccome se 
				//il numero estratto era presente, sostituisco con uno 0
				//il numero corrispondente sulla cartella del giocatore
				cartellaGiocatore=newCartella.getNewCartella();
				gameGiocatori[i].setMyCartella(cartellaGiocatore);
			
			}
			System.out.println("");
			//verifico se ci sono vincitori
			for (int i=0; i<numeroGiocatori;i++) {
				Vittoria vittoria=new Vittoria(gameGiocatori[i].getName(),gameGiocatori[i].getMyCartella());
				continua=vittoria.getWin();
				if (continua) {
					System.out.println("ci sono state "+numeroEstratto.getNumeroEstrazioni()+" estrazioni");
					break;
				}
			}
			System.out.println("");
				
		}
		
	}
}