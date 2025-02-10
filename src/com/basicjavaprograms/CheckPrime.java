package com.basicjavaprograms;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = number.nextInt();
        number.close();
        int Nf = 0;
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                Nf = Nf + 1;
            }
        }
        if (Nf == 0) {
            System.out.println("Entered number is Prime");
        } else {
            System.out.println("Entered number is not a Prime");
            System.out.println("No.of Factors of " + num + " are " + Nf);
        }
    }
}
