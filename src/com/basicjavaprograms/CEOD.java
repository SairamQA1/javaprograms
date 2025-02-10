package com.basicjavaprograms;

import java.util.Scanner;

public class CEOD {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int N = number.nextInt();
        number.close();
        if (N % 2 == 0) {
            System.out.println("The Number " + N + " is Even");
        } else {
            System.out.println("The Number " + N + " is Odd");
        }
    }
}
