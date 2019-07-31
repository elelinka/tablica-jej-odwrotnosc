package com.example.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayUtils {

    public int[] reverseArray(int[] array) {
//        int[] b = new int[n];
//        int j = n;
//        for (int i = 0; i < n; i++) {
//            b[j - 1] = a[i];
//            j = j - 1;
//        }
        Collections.reverse(Arrays.asList(array));
        for (int i = 0; i < originalArray(array).length / 2; i++) {
            int temp = array[i];
        }
        return array;
    }

    public int[] originalArray(int[] array) {
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
