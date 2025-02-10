package com.basicjavaprograms;

import java.util.Scanner;

public class Arithematic {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter two Integers");
        double var1 = reader.nextDouble();
        double var2 = reader.nextDouble();
        System.out.println("Enter an operator(+,-,*,/):");
        char operator = reader.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = var1 + var2;
                break;
            case '-':
                result = var1 - var2;
                break;
            case '*':
                result = var1 * var2;
                break;
            case '/':
                result = var1 / var2;
                break;
            default:
                System.out.println("Error! Operator is not correct");
                return;
        }
        reader.close();
        System.out.println(result);
    }
}