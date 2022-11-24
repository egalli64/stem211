package com.example.stem211.camillaLotti.bingo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class GeneratoreTest {

	@Test
	void testDareNumeriPerNCartelle() {
		Generatore generatore = Generatore.creaGeneratore();
		int numeroCartelle = 1;
		int[][] numeri = generatore.dareNumeriPerNCartelle(numeroCartelle);

//		int numeroRighe = 3;
//		int numeroColonne = 5;
//		int[][] numeriAttesi = new int[numeroRighe][numeroColonne];
//		int count = 0;
//		for (int i = 0; i < numeroRighe; i++) {
//			for (int j = 0; j < numeroColonne; j++) {
//				numeriAttesi[i][j] = count + 1;
//				count++;
//			}
//		}
		
		int[][] numeriAttesi = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

		// con junit dovrei farlo a mano. Quindi nel caso in cui voglio confrontare un array:
		// (1) confronto la lunghezza
		// (2) ciclando sui vari elementi dell'array li confronto con gli elementi dell'altro array
		assertThat(numeriAttesi).isEqualTo(numeri);
	}
	
	@Test
	void testDareNumeriPer2Cartelle() {
		Generatore generatore = Generatore.creaGeneratore();
		int numeroCartelle = 2;
		int[][] numeri = generatore.dareNumeriPerNCartelle(numeroCartelle);
		
		int[][] numeriAttesi = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15},
								{16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}, {26, 27, 28, 29, 30}};

		assertThat(numeriAttesi).isEqualTo(numeri);
	}
	
	@Test
	void testDareNumeriSbagliatiPer2Cartelle() {
		Generatore generatore = Generatore.creaGeneratore();
		int numeroCartelle = 2;
		int[][] numeri = generatore.dareNumeriPerNCartelle(numeroCartelle);
		
		int[][] numeriAttesi = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15},
								{31, 17, 18, 19, 20}, {21, 22, 23, 24, 25}, {26, 27, 28, 29, 30}};

		assertThat(numeriAttesi).isNotEqualTo(numeri);
	}
	
	@Test
	void testDareNumeriPer0Cartelle() {
		Generatore generatore = Generatore.creaGeneratore();
		int numeroCartelle = 0;
		int[][] numeri = generatore.dareNumeriPerNCartelle(numeroCartelle);
		
		int[][] numeriAttesi = {};

		assertThat(numeriAttesi).isEqualTo(numeri);
	}

}
