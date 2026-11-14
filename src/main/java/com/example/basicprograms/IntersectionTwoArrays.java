package com.example.basicprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArrays {
    public static int[] intersection(int[] a, int[] b) {
        Set<Integer> valuesInB = new HashSet<>();
        for (int value : b) {
            valuesInB.add(value);
        }

        int[] commonValues = new int[a.length];
        int count = 0;
        for (int value : a) {
            if (valuesInB.contains(value)) {
                commonValues[count++] = value;
            }
        }

        return Arrays.copyOf(commonValues, count);
    }

    public static void main(String[] args) {
        int[] a = {89, 24, 75, 11, 23};
        int[] b = {89, 2, 4};
        System.out.println(Arrays.toString(intersection(a, b)));
    }
}
