package com.example.basicprograms;

public class BinarySearch {
    public static int binarySearch(int[] arr, int k) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low < arr.length && arr[low] == k ? low : -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 5, 7};
        System.out.println(binarySearch(arr, 3));
        System.out.println(binarySearch(arr, 4));
    }
}
