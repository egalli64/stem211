package com.example.stem211.vincenzo;

import java.util.Arrays;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        System.out.println("Starting the game!");

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(90) + 1 + " ");
        }
        System.out.println();

        int[] numbers = new int[90];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));

        shuffle(numbers);
        System.out.println(Arrays.toString(numbers));
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
