package com.basicjavaprograms;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int Num = number.nextInt();
        number.close();
        int RevN = 0;
        int rem = 0;
        while (Num != 0) {
            rem = Num % 10;
            RevN = RevN * 10 + rem;
            Num = Num / 10;
        }
        System.out.println("Reverse of a Number " + RevN);
    }
}
