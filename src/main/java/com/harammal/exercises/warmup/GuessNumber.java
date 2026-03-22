package com.harammal.exercises.warmup;

import java.util.random.RandomGenerator;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        RandomGenerator rnd = RandomGenerator.getDefault();
        Scanner scanner = new Scanner(System.in);

        int num = 0, guess = -1, attempts = 0;

        while (guess != num) {
            num = rnd.nextInt(0, 4);
            attempts++;

            System.out.println("Guess the number from 0 to 3:");
            guess = scanner.nextInt();

            if (guess != num) {
                System.out.println("Wrong answer! (number: " + num + ")\nTry again\n");
            } else {
                System.out.println("Correct answer!\nAttempts: " + attempts);
            }
        }
    }
}
