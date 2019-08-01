package com.example.main;

import com.example.array.ArrayUtils;

public class Main {

    public static void main(String[] args) {
        int length = 20;

        for (int i : ArrayUtils.reverseArray(length)) {
            System.out.print(i + " ");
        }
    }
}
