package com.example.stem211.silviag.rubrica;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;

public class Rubrica {
	private static final String FILE_NAME = "rubrica.txt";
	private Map<String, String> map;

	public Rubrica() {
		this.map = new TreeMap<>();
		// leggere da file;
	}

	public boolean add(String name, String number) {
		String value = map.putIfAbsent(name, number);
		if (value == null) {
			return true;
		} else {
			return false;
		}
	}

	public void print() {
		System.out.println("Rubrica: ");
		for (var entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println("***");
	}

	public boolean remove(String name) {
		String value = map.remove(name);
		if (value == null) {
			return false;
		} else {
			return true;
		}
	}

	public void save() {
		try (PrintWriter pw = new PrintWriter(FILE_NAME)) {
			for (var entry : map.entrySet()) {
				pw.println(entry);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
