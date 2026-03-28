package com.harammal.exercises.arrays;

public class DivideArrays {

    public static double[] divideArrays(double[] v1, double[] v2) {
        if (v1.length != v2.length) {
            return new double[0];
        }

        double[] f = new double[v1.length];

        for (int i = 0; i < v1.length; i++) {
            f[i] = v1[i] / v2[i];
        }

        return f;
    }
}
