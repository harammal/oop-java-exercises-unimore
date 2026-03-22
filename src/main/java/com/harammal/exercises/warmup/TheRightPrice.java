package com.harammal.exercises.warmup;

import java.util.random.RandomGenerator;
import java.util.Scanner;

public class TheRightPrice {

    public static void main(String[] args){
        RandomGenerator rnd = RandomGenerator.getDefault();
        int num = rnd.nextInt(0, 100);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the right price [0, 100]\nUser 1:");
        int g1 = scanner.nextInt();
        System.out.println("User 2:");
        int g2 = scanner.nextInt();

        int try1 = Math.abs(num - g1);
        int try2 = Math.abs(num - g2);

        if(try1 < try2){
            System.out.println("User 1 wins!\nNumber: " + num);
        }
        else if(try2 < try1){
            System.out.println("User 2 wins!\nNumber: " + num);
        }
        else{
            System.out.println("Draw \nNumber: " + num);
        }
    }
}
