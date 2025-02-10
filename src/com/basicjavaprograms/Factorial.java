package com.basicjavaprograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int factorial = 1;
        Scanner Number = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = Number.nextInt();
        Number.close();
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("com.basicjavaprograms.Factorial of " + num + " is " + factorial);
    }
}
