package com.example.basicprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElements {
    public static ArrayList<Integer> findKLargest(int[] arr, int k) {
        if (k < 0 || k > arr.length) {
            throw new IllegalArgumentException("k must be between 0 and the array length.");
        }

        PriorityQueue<Integer> smallestFirst = new PriorityQueue<>();

        for (int value : arr) {
            smallestFirst.offer(value);
            if (smallestFirst.size() > k) {
                smallestFirst.poll();
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        while (!smallestFirst.isEmpty()) {
            result.add(smallestFirst.poll());
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 787, 1, 23};
        System.out.println(findKLargest(arr, 2));
    }
}
