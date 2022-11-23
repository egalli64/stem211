package com.example.stem211.emanuele.Gdr;

import java.util.Random;

public class Wanderer {
	private static final int FORZA_MAX = 10;
	private static final int FORZA_MIN = 1;
	private String name;
	private int strength;
	private static final Random random = new Random();

	public Wanderer(String name, int strength) {
		this.name = name;
		this.strength = strength;
	}

	public Wanderer(String name) {

		this.name = name;
		this.strength = random.nextInt(FORZA_MIN, FORZA_MAX + 1);
	}

	public String getName() {
		return name;
	}

	public int getStrength() {
		return strength;
	}

	/**
	 * Wanderer fights with orc
	 * 
	 * @param other the enemy
	 * @return true if wanderer wins
	 */
	public boolean fight(Orc orc) {
		if (orc.compareStrength(strength) > 0) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Wanderer [name=" + name + ", strength=" + strength + "]";
	}

}
