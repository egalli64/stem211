package com.example.stem211.silviaMartina.bingo;

public class Bingo {
	private Player[] players;

	public Bingo(int nPlayers, int[] nCards) {
		this.players = new Player[nPlayers];
		for (int i = 0; i < players.length; i++) {
			players[i] = new Player(nCards[i]);
		}

	}

	public static void main(String[] args) { // num_giocatori;num_cartelle_per_ognuno

		System.out.println("Welcome to Bingo");
		if (args.length < 2) {
			System.out.println("not enough gamers");
			return; // controllo_alla_JVM
		}
		int nPlayers = Integer.parseInt(args[0]); // convertire_int_in_string
		System.out.println("Players: " + nPlayers);

		int[] nCards = new int[nPlayers];
		for (int i = 1; i < args.length; i++) { // ilprimoarg_mida_numgiocatori,il_secondo,quanteschedehail_1_giocat
			nCards[i - 1] = Integer.parseInt(args[i]);
		}
		//Bingo bingo = new Bingo(nPlayers, nCards);

		Generator generator = new Generator();
		generator.shuffle();
		System.out.println(generator.getNumber());
	}

}
