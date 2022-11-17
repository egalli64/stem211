package com.example.stem211.martina.bingo;

public class Game {
	public static void main(String[] args) {
		System.out.println("Inizia il gioco!");

		int numeroGiocatori = args.length / 2;
		boolean continua=false;

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
		
		while (continua==false) {

			for (int i=0;i< numeroGiocatori; i++) {
				int[] cartellaGiocatore=gameGiocatori[i].getMyCartella();
				ControlloNumero newCartella=new ControlloNumero(gameGiocatori[i].getName(),cartellaGiocatore,numeroEst);
				cartellaGiocatore=newCartella.getNewCartella();
				gameGiocatori[i].setMyCartella(cartellaGiocatore);
			
			}
			for (int i=0; i<numeroGiocatori;i++) {
				Vittoria vittoria=new Vittoria(gameGiocatori[i].getName(),gameGiocatori[i].getMyCartella());
				continua=vittoria.getWin();
				if (continua==true) {
					System.out.println("ci sono state "+(numeroEstratto.getNumeroEstrazioni()+1)+" estrazioni");
					break;
				}
			}
			
			numeroEstratto.setCount();
			numeroEst=numeroEstratto.getNumeroEstratto();
			System.out.println("numero estratto: "+  numeroEst);
		}
		
	}
}
