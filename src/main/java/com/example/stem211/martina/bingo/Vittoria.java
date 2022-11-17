package com.example.stem211.martina.bingo;

import java.util.Arrays;

public class Vittoria {
	public boolean win=false;
	public int[][] tabella;
	
	public Vittoria(String name ,int[] vettore) {
		int[] zeri= {0,0,0,0,0};
		tabella = tab(vettore);
		for (int[] rig : tabella) {
			if ( Arrays.equals(rig, zeri)) {
				win=true;
				System.out.println(name+" HAI VINTO!");
			}
		}
		if (win==false) {
			System.out.println(name+ " non ha ancora vinto");
		}
		
		
	}
	public boolean getWin() {
		return win;
	}
	
	public int[][] tab(int[] numeri) {
		int numerorighe = numeri.length / 5;
		int[][] matrice = new int[numerorighe][5];

		for (int i = 0; i < numerorighe; i++) {
			for (int j = 0; j < 5; j++) {
				matrice[i][j] = numeri[5 * i + j];
			}
		}

		return matrice;

	}

}
