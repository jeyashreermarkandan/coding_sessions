package com.example.basicprograms;

public class SubarrayProductLessThanK {
    public static int countSubarraysProductLessThanK(int[] arr, long k) {
        for (int value : arr) {
            if (value <= 0) {
                throw new IllegalArgumentException("Array elements must be positive.");
            }
        }

        if (k <= 1) {
            return 0;
        }

        long product = 1;
        int count = 0;
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] >= k) {
                product = 1;
                left = right + 1;
                continue;
            }

            while (product > (k - 1) / arr[right]) {
                product /= arr[left];
                left++;
            }

            product *= arr[right];
            count += right - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(countSubarraysProductLessThanK(arr, 10));
    }
}
