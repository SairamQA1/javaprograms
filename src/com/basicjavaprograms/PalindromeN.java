package com.basicjavaprograms;

import java.util.Scanner;

public class PalindromeN {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int Num = number.nextInt();
        int Qut = Num;
        number.close();
        int RevN = 0;
        int rem = 0;
        while (Qut != 0) {
            rem = Qut % 10;
            RevN = RevN * 10 + rem;
            Qut = Qut / 10;
        }
        if (Num == RevN) {
            System.out.println("Entered number " + Num + " is a Palindrome");
        } else {
            System.out.println("Entered number " + Num + " is not a Palindrome");
        }
    }

}
