package com.example.stem211.alberto.cli;

import java.util.TreeMap;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;

public class Rubrica {
	private static final String FILENAME = "/dev/rubica.txt";
	private Map<String, String> rubrica;

	public Rubrica() {
		
		this.rubrica = new TreeMap<>();
	}

	public boolean add(String name, String number) {
		String value = this.rubrica.put(name, number);
		if (value == null) {
			return true;
		} else {
			return false;
		}
	}

	public boolean remove(String name) {
		String value = this.rubrica.remove(name);
		if (value == null) {
			return true;
		} else {
			return false;
		}
	}

	public void showRubrica() {
		System.out.println("Rubrica:");
		for (var entry : rubrica.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println("-----");
	}

	public void save() {
		try (PrintWriter pw = new PrintWriter(FILENAME)){
			for (var entry : rubrica.entrySet()) {
				pw.println(entry);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void load() {
		
	}

}
