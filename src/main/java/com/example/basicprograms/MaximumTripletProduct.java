package com.example.basicprograms;

public class MaximumTripletProduct {
    public static int maximumTripletProduct(int[] arr) {
        if (arr.length < 3) {
            throw new IllegalArgumentException("Array must contain at least three elements.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int value : arr) {
            if (value >= largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = value;
            } else if (value >= secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = value;
            } else if (value > thirdLargest) {
                thirdLargest = value;
            }

            if (value <= smallest) {
                secondSmallest = smallest;
                smallest = value;
            } else if (value < secondSmallest) {
                secondSmallest = value;
            }
        }

        int largestValuesProduct = largest * secondLargest * thirdLargest;
        int twoSmallestValuesProduct = largest * smallest * secondSmallest;
        return Math.max(largestValuesProduct, twoSmallestValuesProduct);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(maximumTripletProduct(arr));
    }
}
