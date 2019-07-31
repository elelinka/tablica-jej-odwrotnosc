package com.example.main;

import com.example.array.ArrayUtils;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayUtils array = new ArrayUtils();

        int[] tab = new int[10];

        int[] original = array.originalArray(tab);

        int[] tab3 = array.reverseArray(original);
        System.out.println(Arrays.toString(tab3));


    }
}
