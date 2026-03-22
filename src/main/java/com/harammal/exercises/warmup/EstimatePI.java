package com.harammal.exercises.warmup;

public class EstimatePI {

    public static double areInside(double trials) {
        double inside = 0;

        for (int i = 0; i < trials; i++) {
            double xrand = Math.random();
            double yrand = Math.random();

            if ((xrand * xrand + yrand * yrand) < 1) {
                inside++;
            }
        }

        return inside;
    }

    public static void main(String[] args) {

        for (int i = 3; i < 13; i++) {
            double trials = Math.pow(2.0, (double) i);

            double inside = areInside(trials);

            double estimate = 4.0 * inside / trials;
            double error = 100.0 * (estimate -Math.PI)/Math.PI;

            System.out.printf("[trials=2^%d] [error=%fpc] [estimate=%f]\n", i, error, estimate);
        }
    }
}
