package com.example.basicprograms;

public class PeakElement {
    public static int findPeak(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 4};
        System.out.println(findPeak(arr));
    }
}
