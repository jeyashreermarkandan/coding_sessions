package com.example.basicprograms;

import java.util.Arrays;

public class Segregate0and1 {
    public static void segregate0and1(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (left < right && arr[left] == 0) {
                left++;
            }
            while (left < right && arr[right] == 1) {
                right--;
            }

            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        segregate0and1(arr);
        System.out.println(Arrays.toString(arr));
    }
}
