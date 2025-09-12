package com.patternsparttwo;

public class Patterns {
    public static void main(String[] args) {
//        printHollowRectangle(5);
//        printInvertedRotatedHalfPyramid(4);
//        printInvertedHalfPyramidWithNumber(5);
//        printFloydTriangle(5);
//        printZeroOneTriangle(5);
        // printButterflyPattern(8);

        printSolidRhombus(5);
    }

    public static void printSolidRhombus(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void printButterflyPattern(int n) {
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - (2 * i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n/2; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - (2 * i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void printZeroOneTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void printFloydTriangle(int n) {
        int inc = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(inc);
                inc++;
            }
            System.out.println();
        }
    }

    public static void printInvertedHalfPyramidWithNumber(int n) {
        // outer
        for (int i = 1; i <= n; i++) {
            // inner
            for (int j = 1; j <= (n + 1) - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void printInvertedRotatedHalfPyramid(int n) {
        // outer
        for (int i = 1; i <= n; i++) {
            // inner
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();
    }

    public static void printHollowRectangle(int n) {

        // outer
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                // star
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
