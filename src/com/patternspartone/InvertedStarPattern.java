package com.patternspartone;

public class InvertedStarPattern {
    public static void main(String[] args) {
        int n = 4;

        //outer loop
        for (int i = 0; i < n; i++) {

            //inner loop
            for (int j = i; j < n; j++) {

                //print start
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
