package com.example.stem211.silviaMartina.rubricaTelefonica;


public class Main {
	public static void main (String[] args) {
		
		Rubrica rubrica = new Rubrica();
		rubrica.add("Bob", "3562632");
		rubrica.add("Tom", "3556632");
		rubrica.save();
		
		
		
	}

}
