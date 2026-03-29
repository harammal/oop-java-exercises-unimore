package com.harammal.exercises.arrays;

import java.util.Arrays;

public class SearchArray {

    public static boolean containsBruteForce(String[] strings, String searched) {
        for (String string : strings) {
            if (searched.equals(string)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsBinary(String[] strings, String searched) {
        String[] copy = Arrays.copyOf(strings, strings.length);
        Arrays.sort(copy);

        return Arrays.binarySearch(copy, searched) >= 0;
    }
}
