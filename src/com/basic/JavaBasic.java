package com.basic;

import java.util.Scanner;

public class JavaBasic {
    public static void main(String[] args) {
        System.out.println("Hello, World \n Hello, World");
        System.out.println("Hello, World");
        System.out.println("Hello, World");

        // Print a pattern
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

        // variable in java
        int a = 10;
        int b = 10;
        System.out.println(a);
        System.out.println(b);

        String name = "tony";
        System.out.println(name);

        name = "stark";
        System.out.println(name);

        // Data types in java
        // - byte
        // - short
        // - char
        // - int
        // - long
        // - double
        // - float
        // - boolean

        // sum of a + b
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 + num2);

        // taking inputs in java
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println(number1 + number2);
        scanner.close();
    }
}
