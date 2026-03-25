package com.harammal.exercises.arrays;

public class CanBalance {

    public static int sum(int[] v, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += v[i];
        }
        return sum;
    }

    public static boolean canBalance(int[] v) {
        int leftSum = 0, rightSum = 0;

        for (int i = 1; i < v.length; i++) {
            leftSum = sum(v, 0, i);
            rightSum = sum(v, i, v.length);

            if(leftSum == rightSum){
                return true;
            }
        }
        return false;
    }

    // other way
//    public static boolean canBalance(int[] v) {
//        int totalSum = 0;
//        for (int i = 0; i < v.length - 1; i++) {
//            totalSum += n;
//        }
//
//        int leftSum = 0;
//        for (int i = 0; i < v.length - 1; i++) {
//            leftSum += v[i];
//            int rightSum = totalSum - leftSum;

//            if (leftSum == rightSum) {
//                return true;
//            }
//        }
//        return false;
//    }
}
