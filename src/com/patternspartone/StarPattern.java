package com.patternspartone;

public class StarPattern {
    public static void main(String[] args) {
        int n = 4;

        // outer loop
        for (int i = 1; i <= n; i++) {

            // inner loop
            for (int j = 1; j <= i; j++) {

                //printing star
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
