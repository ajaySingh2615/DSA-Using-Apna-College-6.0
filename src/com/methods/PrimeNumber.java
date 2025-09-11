package com.methods;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num : ");
        int num = scanner.nextInt();
        if (!isPrime(num)) {
            System.out.println(num + " is not a prime number");
        } else {
            System.out.println(num + " is a prime number");
        }

    }

    public static boolean isPrime(int num) {
        boolean isPrimeNumber = true;

        if (num < 1) {
            isPrimeNumber = false;
            return isPrimeNumber;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        return isPrimeNumber;
    }
}
