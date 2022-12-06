package com.example.stem211.alberto.cli;

import java.util.Scanner;

//import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Benvenuto nella tua agenda!");
		Rubrica rubrica = new Rubrica();
//		rubrica.add("piero", "233 9846315");
//		rubrica.add("giancarlo", "233 5884315");
//		rubrica.add("astrocane", "233 1828493");
		rubrica.load();
		char command = 'q';
		try (Scanner scanner = new Scanner(System.in)) {
			do {
				System.out.print("Comando? ");
				if (scanner.hasNext()) {
					String input = scanner.next();
					command = input.isBlank() ? 'x' : input.charAt(0);
				}
				if (command == 'i') {
					String name = "";
					String number = "";
					System.out.println("Nome? ");
					if (scanner.hasNext()) {
						name = scanner.next();
					}
					System.out.println("Numero? ");
					if (scanner.hasNext()) {
						number = scanner.next();
					}
					System.out.println("Inserting " + name + " " + number);
					rubrica.add(name, number);
				}
			} while (command != 'x');
		}
		rubrica.save();

	}
}
