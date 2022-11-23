package com.example.stem211.emanuele.Gdr;

import java.util.Random;

public class Orc {
	private static final int FORZA_MAX = 10;
	private static final int FORZA_MIN = 4;
	private String name;
	private int strength;
	private static final Random random = new Random();

	public Orc(String name, int strength) {
		this.name = name;
		this.strength = strength;
	}

	public Orc() {
		this.name = "Shrek";
		this.strength = random.nextInt(FORZA_MIN, FORZA_MAX + 1);
	}
//
//	public int getStrength() {
//		return strength;
//	}

	public String getName() {
		return name;
	}

	public int compareStrength(int other) {
		return strength - other;
	}

	/**
	 * Orc fights with wanderer
	 * 
	 * @param other the enemy
	 * @return true if orc wins
	 */
	public boolean fight(Wanderer other) {
		return true;
	}

	@Override
	public String toString() {
		return "Orc [name=" + name + ", strength=" + strength + "]";
	}

}
