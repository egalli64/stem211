package com.example.stem211.alberto.bingo;

public class Game {
	private static final int MAX_TURNI=90;
	
	public static void main(String[] args) {
		GameRuleChecker check = new GameRuleChecker();
		boolean flag = check.checkStartGame(args);
		if (!flag) {
			System.out.println(
					"Please add some players, each followed by the number of their cartelle (maximum of 6 cart for player)");
		} else {
			System.out.println("Welcome to the bingo!!");

			Player[] players = new Player[args.length / 2];
			for (int i = 0, j = 0; i < args.length; i += 2, j++) {
				int x = Integer.valueOf(args[i + 1]);
				players[j] = new Player(args[i], x);
				// System.out.println(players[j].getName());
			}
			Banco banco = new Banco();
			for(int turni=0;turni<MAX_TURNI;turni++) {
				int num = banco.estrazione();
				boolean vittoria=false;
				for (int k = 0; k < players.length; k++) {
					//vittoria = players[k].checkVittoria();
					if(vittoria) {
						System.out.println("Complimenti" + players[k].getName()+"ha vinto!!");
					}
				}
			}
			
			// System.out.println(num);

		}

	}
}
