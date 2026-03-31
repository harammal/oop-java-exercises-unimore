package com.harammal.exercises.strings;

import java.util.Arrays;

public class DuplicateChars {

    public static char[] duplicateChars(String input) {
        if (input.length() < 2) {
            return new char[0];
        }

        StringBuilder seen = new StringBuilder();
        StringBuilder duplicates = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            String c = String.valueOf(input.charAt(i));

            if (!seen.toString().contains(c)) {
                seen.append(c);
            } else if (!duplicates.toString().contains(c)) {
                duplicates.append(c);
            }
        }

        char[] result = duplicates.toString().toCharArray();
        Arrays.sort(result);

        return result;
    }
}
