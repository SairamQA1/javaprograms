package com.basicjavaprograms;

import java.util.Scanner;

public class PalindromeS {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Enter a String");
        String W = word.next();
        word.close();
        int Length = W.length();
        String Rw = "";
        for (int i = Length - 1; i >= 0; i--) {
            Rw = Rw + W.charAt(i);
        }
        if (W.equals(Rw)) {
            System.out.println("Entered String " + W + " is a Palindrome");
        } else {
            System.out.println("Entered String " + W + " is not a Palindrome");
        }
    }
}
