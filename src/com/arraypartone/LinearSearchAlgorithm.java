package com.arraypartone;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 50};
        int key = 45;

        int result = linearSearchAlgo(arr, key);

        if(result == -1){
            System.out.println("key is not found");
        }else{
            System.out.println("key is found at index = " + (result+1));
        }

    }

    public static int linearSearchAlgo(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if(key == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
