package com.harammal.exercises.arrays;

import java.util.Arrays;

public class Splitter {

    public static int[] splitter(int input) {
        String string_num = Integer.toString(input);
        int size = string_num.length();
        int[] digits = new int[size];

        for (int i = 0; i<size; i++){
            digits[i] = Character.getNumericValue(string_num.charAt(i));
        }

        return digits;
    }
}
