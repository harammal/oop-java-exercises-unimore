package com.harammal.exercises.arrays;

import java.util.Arrays;

public class MoveZerosEnd {

    public static int[] moveZerosEnd(int[] v) {
        int[] zeros = new int[v.length];

        int cont = 0;

        for(int i=0; i<zeros.length; i++){
            if(v[i] != 0){
                zeros[cont] = v[i];
                cont++;
            }
        }

        return zeros;
    }
}
