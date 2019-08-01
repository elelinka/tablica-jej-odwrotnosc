package com.example.main;

import com.example.array.ArrayUtils;

public class Main {

    public static void main(String[] args) {
        int length = 20;
        int[] array = ArrayUtils.reverseArray(length);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
