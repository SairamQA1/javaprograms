package com.basicjavaprograms;

import java.util.Scanner;

public class ReverseStringWSbiM {
    static String Rs = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String S = sc.next();
        sc.close();
        ReverseStringWSbiM rs = new ReverseStringWSbiM();
        System.out.println("Reverse of " + S + " is " + rs.Rs(S));
    }

    public String Rs(String S) {
        int Ls = S.length();
        if (Ls == 1) {
            return S;
        } else {
            Rs = S.charAt(Ls - 1) + Rs(S.substring(0, Ls - 1));
            return Rs;
        }
    }
}
