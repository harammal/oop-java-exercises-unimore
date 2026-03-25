package com.harammal.exercises.arrays;

import java.util.Arrays;

public class DeepCopy {

    public static int[][] deepCopy(int[][] original) {
        int rows = original.length;
        int[][] copy = new int[rows][];

        for (int r = 0; r < rows; r++) {
            copy[r] = Arrays.copyOf(original[r], original[r].length);
        }

        return copy;
    }
}
