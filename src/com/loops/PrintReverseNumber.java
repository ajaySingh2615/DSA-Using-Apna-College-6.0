package com.loops;

class PrintReverseNumber{
    public static void main(String[] args) {
        int num = 10899;
        int reverse = 0;

        while (num > 0){
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }

        System.out.println("reverse = " + reverse);
    }
}