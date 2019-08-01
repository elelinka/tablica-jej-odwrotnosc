package com.example.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {

    public int[] reverseArray() {

        int[] originalArray = originalArray();
        int[] array = Arrays.copyOf(originalArray, 20);

        for (int i = 10; i < array.length; i++) {
            array[i] = originalArray[array.length - i - 1];
        }
        return array;
    }

    private int[] originalArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumbers();
        }
        return array;
    }

    private int randomNumbers() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
