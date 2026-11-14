package com.example.basicprograms;

public class CountOddEven {
    public static int[] countOddEven(int[] arr) {
        int oddCount = 0;
        int evenCount = 0;

        for (int value : arr) {
            if (value % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return new int[]{oddCount, evenCount};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] counts = countOddEven(arr);
        System.out.println(counts[0] + " " + counts[1]);
    }
}
