package com.methods;

public class DecimalToBinary {
    public static void main(String[] args) {
        decToBin(7);
        decToBin(5);
        decToBin(11);
    }

    public static void decToBin(int num) {
        int pow = 0;
        int binNum = 0;

        while (num > 0) {
            int rem = num % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));

            pow++;
            num /= 2;
        }

        System.out.println("Binary = " + binNum);
    }
}
