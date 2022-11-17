package com.example.stem211.martina.bingo;

public class ControlloNumero {
	public int[][] tabella;
	
	public ControlloNumero(String name,int[] numeriGame,int numeroEstratto) {
		tabella=tab(numeriGame);
		for (int[] rig:tabella) {
			for (int i:rig) {
				if(i==numeroEstratto) {
					i=0;
					System.out.println(name +" ha il numero estratto");
					break;
				}
			}
		}
		
		
	}
	
//	public int[] ritornTab(int[][] tab1) {
//		int lunghezza=
//		int[] copia= new int[numeri];
//		
//	}
//	
	
	public int[][] tab(int[] numeri) {
		int numerorighe= numeri.length/5;
		int[][] matrice= new int[numerorighe][5];
		
		for (int i=0;i<numerorighe;i++) {
			for (int j=0;j<5;j++) {
				matrice[i][j]=numeri[5*i+j];
			}
		}
		
		return matrice;
		
	}
	

}
