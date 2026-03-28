package com.harammal.exercises.arrays;

import java.util.random.RandomGenerator;
import java.util.Arrays;

public class FillArray {

    public static double[] fillArray(int size, double value, boolean addNoise) {
        double[] v = new double[size];

        if (!addNoise) {
            for (int i = 0; i < v.length; i++) {
                v[i] = value;
            }

            // Produces the same result as the manual version.
            // Arrays.fill(v, value);

        } else {
            RandomGenerator rnd = RandomGenerator.getDefault();
            
            for (int i = 0; i < v.length; i++) {
                v[i] = rnd.nextDouble(value - value * 0.05, value + value * 0.05);
            }
        }

        return v;
    }
}
