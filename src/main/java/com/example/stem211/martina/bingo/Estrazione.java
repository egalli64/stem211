package com.example.stem211.martina.bingo;

import java.util.Random;

public class Estrazione {
	public int[] numeriBingo;
	public int count;
	
	public  Estrazione() {
		this.numeriBingo = new int[90];
		for (int i = 0; i < 90; i++) {
			numeriBingo[i] = i+1;
		}
		shuffle(numeriBingo);
	}
	
	public int getNumeroEstratto() {
		return numeriBingo[count];
	}
	public int getNumeroEstrazioni(){
		return count;
	}
	
	public void setCount() {
		this.count+=1;
	}

	
	public static void shuffle(int[] data) {
        Random random = new Random();

        for (int i = 0; i < data.length; i++) {
            int j = random.nextInt(data.length);
            int temp = data[i];
            data[i] = data[j];
            data[j] = temp;
        }
    }

}
