package com.example.stem211.alberto.cli;

import java.util.Scanner;

public class GestoreIO {

	public static void start(Rubrica rubrica) {
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
	}
//	private static final String ABSOLUTE_FILE_NAME = "/dev/rubica.csv";
//	
//	public static Map<String, String> load() {
//		try {
//			File file = new File(ABSOLUTE_FILE_NAME);
//			if (file.canRead()) {
//				
//			} else if (file.createNewFile()) {
//				
//			} else {
//				
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		Map<String, String> rubrica = new HashMap<>();
//		return rubrica;
//	}

}
