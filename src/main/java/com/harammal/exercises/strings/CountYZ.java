package com.harammal.exercises.strings;

import java.util.StringTokenizer;

public class CountYZ {

    public static int countYZ(String string) {
        String[] result = string.split("\\s+");
        int count = 0;

        for (String s : result) {
            if (s.toLowerCase().endsWith("y") || s.toLowerCase().endsWith("z")) {
                count++;
            }
        }
        return count;
    }
}
