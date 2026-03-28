package com.harammal.exercises.arrays;

import java.util.Arrays;

public class Fibonacci {

    public static long[] fibonacci(int n) {
        long[] series = new long[n];

        if (n == 0) {
            return series;
        }
        if (n == 1) {
            series[0] = 0;
            return series;
        }

        series[0] = 0;
        series[1] = 1;

        for (int i = 2; i < series.length; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }

        return series;
    }
}
