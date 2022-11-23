package com.example.stem211.emanuele.Gdr;

public class Main {
	private Wanderer wanderer;
	private Orc orc;

	public Main(String name) {
		this.wanderer = new Wanderer(name);
		this.orc = new Orc();
	}

	public void start() {
		System.out.println(wanderer);
		System.out.println(orc);
		boolean fightResult = wanderer.fight(orc);
		System.out.println("Did you win?" + " " + fightResult);
		

	}

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("I need name of Wanderer");
			return;

		}
		Main main = new Main(args[0]);
		main.start();

	}

}
