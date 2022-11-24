package com.example.stem211.camillaLotti.bingo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class GiocatoreTest {

	@Test
	void testCheckCartelle() {
		
		// COMMENTARE SHUFFLE NELLA CLASSE GIOCATORE
		int[] numeri = { 1, 2, 3, 4, 5 };
		Generatore generatore = Generatore.creaGeneratore();
		Giocatore giocatore = Giocatore.creaGiocatore("giocatore", 1, generatore);
		System.out.println(giocatore.toString());

		boolean result = false;

		for (int i = 0; i < numeri.length; i++) {
			if (giocatore.checkCartelle(numeri[i])) {
				result = true;
			}
		}
		System.out.println(result);

		assertTrue(result);
	}
	
	@Test
	void testCheckCartelleFalse() {

		int[] numeri = { 1, 2, 3, 4, 31 };
		Generatore generatore = Generatore.creaGeneratore();
		Giocatore giocatore = Giocatore.creaGiocatore("giocatore", 1, generatore);
		System.out.println(giocatore.toString());

		boolean result = false;

		for (int i = 0; i < numeri.length - 1; i++) {
			if (giocatore.checkCartelle(numeri[i])) {
				result = true;
			}
		}
		System.out.println(result);

		assertFalse(result);
	}

}
