package com.methods;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any num: ");
        int num = scanner.nextInt();

        int result = factorialOfNumber(num);
        System.out.println("the factorial of a " + num + " = " + result);

    }

    public static int factorialOfNumber(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        return fact;
    }
}
