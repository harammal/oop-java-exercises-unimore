package com.harammal.exercises.arrays;

import java.util.Arrays;

public class CopyArray {

    public static double[] copyArray(double[] v) {
        double[] copy = new double[v.length];

        for(int i=0; i<v.length; i++){
            copy[i] = v[i];
        }

        // Produces the same result as the manual version
        // System.arraycopy(v, 0, copy, 0, v.length);

        return copy;
    }
}
