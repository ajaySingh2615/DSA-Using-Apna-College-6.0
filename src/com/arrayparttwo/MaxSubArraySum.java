package com.arrayparttwo;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};

//        printMaxSubArraySumUsingBruteForceMethod(arr);
//        printMaxSubArraySumUsingPrefixSumMethod(arr);

        printMaxSubArraySumUsingKadaneAlgo(arr);
    }

    public static void printMaxSubArraySumUsingKadaneAlgo(int[] arr){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for (int j : arr) {
            cs = cs + j;
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }

        System.out.println("maximum sum = " + ms);
    }

    public static void printMaxSubArraySumUsingPrefixSumMethod(int[] arr) {
        int ms = Integer.MIN_VALUE;

        int[] prefix = new int[arr.length];
        // calculate prefix array
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                ms = Math.max(sum, ms);
            }
        }

        System.out.println("Maximum sum = " + ms);

    }

    public static void printMaxSubArraySumUsingBruteForceMethod(int[] arr) {
        int maximumSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                System.out.print(sum);
                maximumSum = Math.max(maximumSum, sum);
                System.out.println();
            }
        }

        System.out.println("The maximum sum = " + maximumSum);
    }
}
