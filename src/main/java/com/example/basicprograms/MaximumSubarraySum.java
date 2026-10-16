package com.example.basicprograms;

public class MaximumSubarraySum {
    public static int maxSubarraySum(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array must contain at least one element.");
        }

        int currentSum = arr[0];
        int maximumSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maximumSum = Math.max(maximumSum, currentSum);
        }

        return maximumSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }
}
