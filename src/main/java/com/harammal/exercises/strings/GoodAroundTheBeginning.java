package com.harammal.exercises.strings;

public class GoodAroundTheBeginning {

    public static boolean goodAroundTheBeginning(String s) {
        return s.length() >= 4 && (s.startsWith("good") || s.startsWith("good", 1));
    }
}
