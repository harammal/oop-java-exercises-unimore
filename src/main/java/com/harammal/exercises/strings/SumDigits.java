package com.harammal.exercises.strings;

public class SumDigits {

    public static int sumDigits(String string) {
        int sum = 0;

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }

        return sum;
    }
}
