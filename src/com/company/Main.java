package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in;
        String continues;

        do {

            int firstNumber = 0;
            int secondNumber = 1;
            int nextNumber;
            int runTimes;

            do {

                in = new Scanner(System.in);
                System.out.println("How many times would you like to run the program?");
                runTimes = in.nextInt();

            } while (runTimes < 0);

            for (int i = 0; i < runTimes; i++) {

                System.out.println(firstNumber);
                nextNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = nextNumber;

            }

            in = new Scanner(System.in);
            System.out.println("Again? (y/n)");
            continues = in.next();

        } while (continues.equals("y"));

        System.out.println("Goodbye.");
    }
}
