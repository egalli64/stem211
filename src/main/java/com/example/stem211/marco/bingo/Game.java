package com.example.stem211.marco.bingo;

import com.example.stem211.martina.bingo.Giocatore;

public class Game {
	public static void main(String[] args) {
		System.out.println("Starting the game!");
		
		if (args.length<2) {
			System.out.println("Not enough players");
			return;
		}
		
		int nPlayers = Integer.parseInt(args[0]);
		
		Player[] players = new Player[nPlayers];
		System.out.println("players: ");
		
		Ngen ngen = new Ngen();
		
		ngen.shuffle();
		ngen.shuffle();
	}

}
