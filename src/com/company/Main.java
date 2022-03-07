package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        for (int number : array) {
            array[number-1] += 12;
        }
        System.out.println(Arrays.toString(array));
    }
}
