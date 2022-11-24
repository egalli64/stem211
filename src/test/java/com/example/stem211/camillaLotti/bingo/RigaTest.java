package com.example.stem211.camillaLotti.bingo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class RigaTest {

	@Test
	void testCheckSingoliNumeri() {
		int[] numeri = {1, 2, 3, 4, 5};
		Riga riga = new Riga(numeri);
		boolean result = false;
		
		for (int i = 0; i < numeri.length; i ++) {
			if (riga.checkSingoliNumeri(i + 1)) {
				result = true;
			}
		}
		
		assertTrue(result);
	}
	
	@Test
	void testCheckNotCinquina() {
		int[] numeri = {10, 11, 12, 13, 14};
		Riga riga = new Riga(numeri);
		boolean result = false;
		
		for (int i = 0; i < numeri.length; i ++) {
			if (riga.checkSingoliNumeri(i + 1)) {
				result = true;
			}
		}
		
		assertFalse(result);
	}
	
	@Test
	void testCheck4volte() {
		int[] numeri = {1, 2, 3, 4, 5};
		Riga riga = new Riga(numeri);
		boolean result = false;
		
		for (int i = 0; i < numeri.length - 1; i ++) {
			if (riga.checkSingoliNumeri(i + 1)) {
				result = true;
			}
		}
		
		assertFalse(result);
	}
	
	@Test
	void testCheck0volte() {
		int[] numeri = {1, 2, 3, 4, 5};
		Riga riga = new Riga(numeri);
		boolean result = false;
		
		for (int i = 0; i < 1; i ++) {
			if (riga.checkSingoliNumeri(i + 1)) {
				result = true;
			}
		}
		
		assertFalse(result);
	}

}
