package com.example.stem211.silviaMartina.rubricaTelefonica;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;

public class Rubrica {
	private static final String FILE_NAME = "agenda.txt";
	private Map<String, String> map;

	public Rubrica() {
		this.map = new TreeMap<>(); // CostruttoreCrealaMappavuota

		// TODO: LeggereDaFile;

	}

	// MetodocheChiamiamodaMainperinserireNellaMappaunUtenteConNumero
	public boolean add(String name, String number) {
		String value = map.putIfAbsent(name, number);
		if (value == null) {
			return true;
		} else {
			return false;
		}
	}

	public void print() {
		System.out.println("Rubrica :");
		for (var entry : map.entrySet()) { // setdituttiisetChiaviValore
			System.out.println(entry.getKey() + " : " + entry.getValue()); // stampiamotuttelecoppieKeyValue
		}
		System.out.println(" *** ");
	}

	public boolean remove(String name) {
		String value = map.remove(name);
		if (value == null) {
			return false;
		} else {
			return true;
		}
	}

	public void save() { // Metodo:salvosulFilelaRubrica
		try (PrintWriter pw = new PrintWriter(FILE_NAME)) { // vogliolavoraresuquestofile

			for (var entry : map.entrySet()) {
				pw.println(entry); // JavastampalacoppiaKeyValue

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void load() {

	}
}
