package com.patternspartone;

public class HalfPyramid {
    public static void main(String[] args) {
        int n = 4;
        int inc = 1;

        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                //print num
                System.out.print(inc);
                inc++;
            }
            inc = 1;
            System.out.println();
        }
    }
}
