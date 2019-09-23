package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber;
        int runTimes;
        Scanner in;

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
    }
}
