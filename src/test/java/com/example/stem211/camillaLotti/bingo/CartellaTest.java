package com.example.stem211.camillaLotti.bingo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class CartellaTest {

	@Test
	void testCheckRighe() {

		int[][] numeri = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		Cartella cartella = Cartella.creaCartella(numeri);

		boolean result = false;

		for (int i = 0; i < numeri[0].length; i++) {
			if (cartella.checkRighe(i + 1)) {
				result = true;
			}
		}
		
		assertTrue(result);
	}
	
	@Test
	void testCheckRigheFalse() {

		int[][] numeri = { { 1, 2, 3, 4, 31 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		Cartella cartella = Cartella.creaCartella(numeri);

		boolean result = false;

		for (int i = 0; i < numeri[0].length; i++) {
			if (cartella.checkRighe(i + 1)) {
				result = true;
			}
		}
		
		assertFalse(result);
	}

}
