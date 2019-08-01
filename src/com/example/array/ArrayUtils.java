package com.example.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {

    public static int[] reverseArray(int newLength) {

        int[] originalArray = originalArray(newLength);
        int[] array = Arrays.copyOf(originalArray, newLength * 2);


        for (int i = array.length / 2; i < array.length; i++) {
            array[i] = originalArray[array.length - i - 1];
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
