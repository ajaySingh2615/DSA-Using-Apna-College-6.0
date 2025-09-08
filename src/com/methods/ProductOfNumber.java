package com.methods;

import java.util.Scanner;

public class ProductOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("enter num2: ");
        int num2 = sc.nextInt();

        int result = num1 * num2;
        System.out.println("The result is : " + num1 * num2);
    }

    public static int productOfNumbers(int num1, int num2) {
        return num1 * num2;
    }
}
