package com.harammal.exercises.arrays;

public class BubbleSort {

    public static void bubbleSort(int[] v) {
        int n = v.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    // Swap
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }

    public static int[] bubbleSortCopy(int[] v) {
        int[] copy = new int[v.length];

        System.arraycopy(v, 0, copy, 0, v.length);
        bubbleSort(copy);
        return copy;
    }
}
