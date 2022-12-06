package com.example.stem211.alberto.cli;

import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Map;
import java.util.Scanner;

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
		try (PrintWriter pw = new PrintWriter(FILENAME)) {
			for (var entry : rubrica.entrySet()) {
				pw.println(entry);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void load() {
		File f = new File(FILENAME);
		String contact = "";
		try (Scanner scanner = new Scanner(f)) {
			if (scanner.hasNext()) {
				contact = scanner.nextLine();
				String[] c = contact.split("=");
				this.rubrica.put(c[0], c[1]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
