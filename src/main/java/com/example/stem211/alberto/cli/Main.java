package com.example.stem211.alberto.cli;

//import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Benvenuto nella tua agenda!");
		Rubrica rubrica = new Rubrica();
		
		rubrica.add("piero", "233 9846315");
		rubrica.add("giancarlo", "233 5884315");
		rubrica.add("astrocane", "233 1828493");
		
		rubrica.save();
		
//		Scanner scanner = new Scanner(System.in);
//		double result = 0;
//		while (scanner.hasNext()) {
//			if (scanner.hasNextDouble()) {
//				result += scanner.nextDouble();
//			} else {
//				System.out.println("Bad input, discarded: " + scanner.next());
//			}
//		}
//		scanner.close();
//		System.out.println("Total is " + result);
	}
}
