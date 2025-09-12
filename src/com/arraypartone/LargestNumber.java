package com.arraypartone;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 5};

        System.out.println("largest number : " + printLargestNumber(arr));

    }

    public static int printLargestNumber(int[] arr){
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(largest < arr[i]){
                largest = arr[i];
            }
        }

        return largest;
    }
}
