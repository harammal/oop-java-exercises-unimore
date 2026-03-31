package com.harammal.exercises.strings;

public class GoodAtTheBeginning {

    public static boolean goodAtTheBeginning(String s) {
        return s.length() >= 4 && s.charAt(0) == 'g' && s.charAt(1) == 'o' && s.charAt(2) == 'o' && s.charAt(3) == 'd';

        // other version
//        if (s.length() < 4) {
//            return false;
//        }
//        return s.startsWith("good");
    }
}
