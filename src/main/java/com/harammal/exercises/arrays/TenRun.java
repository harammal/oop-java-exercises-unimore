package com.harammal.exercises.arrays;

public class TenRun {

    public static int[] tenRun(int[] v) {
        int length = v.length, multiple = 0;

        // new vector
        boolean check = false;
        int[] ten = new int[length];

        for (int i = 0; i < length; i++) {
            if (v[i] != 0 && v[i] % 10 == 0) {
                multiple = v[i];
                check = true;
            }
            if (check) {
                ten[i] = multiple;
            } else {
                ten[i] = v[i];
            }
        }

        // in vector
//        for (int i = 0; i < length; i++) {
//            if (v[i] != 0 && v[i] % 10 == 0) {
//                multiple = v[i];
//            } else if (multiple != 0) {
//                v[i] = multiple;
//            }
//        }

        return ten;
    }
}
