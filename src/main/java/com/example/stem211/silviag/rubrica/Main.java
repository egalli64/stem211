package com.example.stem211.silviag.rubrica;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Rubrica rubrica = new Rubrica();
		
		rubrica.add("Giovanni", "0465454351");
		rubrica.add("Sara", "516515165");
		rubrica.save();
		
//		System.out.println("Please, enter the name and the telephon number");
//		Scanner scanner = new Scanner(System.in);
//		
//		scanner.close();
	}

}
