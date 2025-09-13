package com.arraypartone;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };

        reverseAnArray(arr);

        System.err.println(Arrays.toString(arr));
    }

    public static void reverseAnArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }
}
