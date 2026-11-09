package com.example.basicprograms;

import java.util.ArrayList;

public class FirstLastSorted {
    public static ArrayList<Integer> findFirstAndLast(int[] arr, int x) {
        int first = findBound(arr, x, false);

        if (first == arr.length || arr[first] != x) {
            ArrayList<Integer> result = new ArrayList<>();
            result.add(-1);
            result.add(-1);
            return result;
        }

        int last = findBound(arr, x, true) - 1;
        ArrayList<Integer> result = new ArrayList<>();
        result.add(first);
        result.add(last);
        return result;
    }

    private static int findBound(int[] arr, int x, boolean afterMatches) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < x || (afterMatches && arr[mid] == x)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 5, 7};
        ArrayList<Integer> result = findFirstAndLast(arr, 3);
        System.out.println("First occurrence: " + result.get(0));
        System.out.println("Last occurrence: " + result.get(1));
    }
}
