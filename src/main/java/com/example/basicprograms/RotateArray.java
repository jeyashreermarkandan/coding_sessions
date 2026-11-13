package com.example.basicprograms;

public class RotateArray {
    public static void rotateLeft(int[] arr, int d) {
        if (d < 0) {
            throw new IllegalArgumentException("Rotation distance must not be negative.");
        }
        if (arr.length == 0) {
            return;
        }

        d %= arr.length;
        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int value = arr[start];
            arr[start] = arr[end];
            arr[end] = value;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotateLeft(arr, 2);

        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
