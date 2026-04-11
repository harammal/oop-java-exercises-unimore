package com.harammal.exercises.oop_full.reverse;

public class ReverserSlow implements Reverser {
    @Override
    public String reverse(String s) {
        char[] reversed = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            reversed[s.length() - i - 1] = s.charAt(i);
        }

        return String.valueOf(reversed);
    }
}
