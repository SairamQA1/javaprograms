package com.basicjavaprograms;

import java.util.Scanner;

public class ReverseString {
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
        System.out.println(" Reverse of a String is " + Rw);
    }

}
