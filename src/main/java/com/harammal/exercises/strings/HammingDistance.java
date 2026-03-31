package com.harammal.exercises.strings;

public class HammingDistance {

    public static int hammingDistance(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return -1;
        }

        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)){
                count++;
            }
        }

        return count;
    }
}
