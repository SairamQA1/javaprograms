package com.basicjavaprograms;

import java.util.Scanner;

public class ReverseStringSB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word:");
        String S = sc.next();
        sc.close();
        StringBuffer Rs = new StringBuffer(S);
        System.out.println("Reverse of the word : " + Rs.reverse());
        StringBuilder sb = new StringBuilder("India");
        System.out.println(sb + " in reverse " + sb.reverse());
    }

}
