package com.harammal.exercises.warmup;

import java.util.Scanner;

public class MonkeyTrouble {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is the monkey a smiling? (true/false)");
        boolean aSmile = scanner.nextBoolean();
        System.out.println("Is the monkey b smiling? (true/false)");
        boolean bSmile = scanner.nextBoolean();

        if(aSmile == bSmile){
            System.out.println("We are in trouble!");
        }
        else{
            System.out.println("We are not in trouble");
        }
    }
}
