package com.harammal.exercises.strings;

public class Palindrome {

    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        String reversed = new StringBuilder(s).reverse().toString();

        return s.equalsIgnoreCase(reversed);
    }
}
