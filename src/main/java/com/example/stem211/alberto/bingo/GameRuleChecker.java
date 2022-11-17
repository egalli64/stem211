package com.example.stem211.alberto.bingo;

public class GameRuleChecker {

	public boolean checkStartGame(String[] args) {
		boolean flag = true;
		if (!(!(args.length < 4) && args.length % 2 == 0)) {
			flag = false;
		} else {
			for (int i = 0; i < args.length; i++) {
				if(i % 2 != 0) {
					int x = Integer.valueOf(args[i]);
					if (x < 0 || x > 6) {
						flag = false;
					}
				}
			}
		}
		return flag;
	}
	
	
}
