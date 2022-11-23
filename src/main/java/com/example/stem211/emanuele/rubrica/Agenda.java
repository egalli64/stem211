package com.example.stem211.emanuele.rubrica;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Agenda {
	private static final String FILE_NAME = "agenda.txt";
	private Map<String, String> agenda;

	public Agenda() {
		this.agenda = new HashMap<>();

	}

	public boolean add(String name, String number) {
		String value = agenda.putIfAbsent(name, number);
		if (value == null)
			return true;
		else {
			return false;
		}
	}

	public void print() {
		System.out.println("Agenda: ");
		for (var entry : agenda.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println("*******");
	}

	public boolean remove(String name) {
		String value = agenda.remove(name);
		if (value == null)
			return false;
		else {
			return true;
		}
	}

	public void save() {
		try {
			PrintWriter pw = new PrintWriter(FILE_NAME);
			for (var entry : agenda.entrySet()) {
				pw.println(entry);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
