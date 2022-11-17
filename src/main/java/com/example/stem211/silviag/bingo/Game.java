package com.example.stem211.silviag.bingo;

import java.util.Arrays;
import java.util.Random;

public class Game {
	private Giocatore[] players;
	
	public Game(int nPlayers, int[] nCards) {
		this.players = new Giocatore[nPlayers]; //arrey con tanti spazi quanti sono i giocatori
		for(int i = 0; i < nPlayers; i++) {
			players[i] = new Giocatore(nCards[i]); 
			
		}
	}
	
    public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Not enough players");
			return;
		}
    int nPlayers = Integer.parseInt(args[0]);
    System.out.println("Players: " + nPlayers);
    
    int[] nCards = new int[nPlayers];
    for (int i = 1; i < args.length; i++) {
    	nCards[i-1] = Integer.parseInt(args[i]);
    }
    
    Game game = new Game(nPlayers, nCards);
    
    }
}
