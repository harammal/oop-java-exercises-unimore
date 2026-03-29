package com.harammal.exercises.arrays;

public class FizzBuzz {

    public static String[] fizzBuzz(int start, int end){
        if(start >= end || start < 0){
            return new String[0];
        }
        String[] result = new String[end - start];

        for(int i = start; i < end; i++){
            if(i % 3 == 0 && i % 5 == 0){
                result[i - start] = "FizzBuzz";
            }
            else if(i % 3 == 0){
                result[i - start] = "Fizz";
            }
            else if(i % 5 == 0){
                result[i - start] = "Buzz";
            }
            else{
                result[i - start] = Integer.toString(i);
            }
        }
        return result;
    }
}
