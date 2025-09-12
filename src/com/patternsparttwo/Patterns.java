package com.patternsparttwo;

public class Patterns {
    public static void main(String[] args) {
//        printHollowRectangle(5);

        printInvertedRotatedHalfPyramid(4);
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
