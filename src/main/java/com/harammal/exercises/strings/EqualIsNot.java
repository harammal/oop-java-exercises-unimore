package com.harammal.exercises.strings;

import java.util.StringTokenizer;

public class EqualIsNot {

    public static boolean equalIsNot(String string) {
        if(string == null || string.isBlank()){
            return true;
        }

        int indexIs = string.indexOf("is"), indexNot = string.indexOf("not");

        while(indexIs != -1 && indexNot != -1){
            indexIs = string.indexOf("is", indexIs + 2);
            indexNot = string.indexOf("not", indexNot + 2);

        }

        return indexIs == indexNot;
    }
}
