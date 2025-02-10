package com.basicjavaprograms;

public class PrimeList {
    public static void main(String[] args) {
        System.out.println("Prime Numbers Between 1 to 100 :");
        for (int N = 1; N <= 100; N++) {
            int nf = 0;
            for (int i = 2; i <= N - 1; i++) {
                if (N % i == 0) {
                    nf = nf + 1;
                }
            }
            if (nf == 0) {
                System.out.print(N + " ");
            }
        }
    }
}
