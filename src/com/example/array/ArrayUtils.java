package com.example.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {

    public static int[] reverseArray(int newLength) {

        int[] originalArray = originalArray(newLength / 2);
        int[] array = Arrays.copyOf(originalArray, newLength);

        if (newLength % 2 == 0) {
            for (int i = newLength / 2; i < newLength; i++) {
                array[i] = originalArray[newLength - i - 1];
            }
        } else {
            System.out.println("Podano nieparzysty rozmiar tablicy: " + newLength);
        }
        return array;
    }

    private static int[] originalArray(int arrayLength) {
        int[] array = new int[arrayLength];

        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
