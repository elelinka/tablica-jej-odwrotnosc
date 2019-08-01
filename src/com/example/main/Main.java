package com.example.main;

import com.example.array.ArrayUtils;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayUtils array = new ArrayUtils();

        String arrayS = Arrays.toString(array.reverseArray())
                .replace(',', ' ')
                .replace('[', '\u0000')
                .replace(']', '\u0000');

        System.out.println(arrayS);


    }
}
