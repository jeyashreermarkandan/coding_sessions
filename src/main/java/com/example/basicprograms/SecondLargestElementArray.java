package com.example.basicprograms;

public class SecondLargestElementArray {
    public static int findSecondLargest(int[] arr) {
        int largest = -1;
        int secondLargest = -1;

        for (int value : arr) {
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value < largest && value > secondLargest) {
                secondLargest = value;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(findSecondLargest(arr));
    }
}
