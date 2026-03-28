package com.harammal.exercises.arrays;

public class DivideArray {

    public static double[] divideArray(double[] v, double factor) {
        double[] f = new double[v.length];
        for (int i = 0; i < v.length; i++) {
            f[i] = v[i] / factor;
        }

        return f;
    }
}
