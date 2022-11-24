package com.example.stem211.silviag.rubrica;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Rubrica rubrica = new Rubrica();
//		rubrica.add("Sara", "516515165");
//		rubrica.save();
		
		char command = 'x';
		try (Scanner scanner = new Scanner(System.in)) {
			do {
				System.out.print("Comando? ");
				if (scanner.hasNext()) {
					String input = scanner.next();
					command = input.isBlank()? 'x':input.charAt(0);
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
		System.out.println("Done! ");
		
	}

}
