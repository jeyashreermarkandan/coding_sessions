package com.example.basicprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoArrays {
    public static ArrayList<Integer> intersection(int[] a, int[] b) {
        Set<Integer> valuesInB = new HashSet<>();
        for (int value : b) {
            valuesInB.add(value);
        }

        ArrayList<Integer> commonValues = new ArrayList<>();
        for (int value : a) {
            if (valuesInB.contains(value)) {
                commonValues.add(value);
            }
        }

        return commonValues;
    }

    public static void main(String[] args) {
        int[] a = {89, 24, 75, 11, 23};
        int[] b = {89, 2, 4};
        System.out.println(intersection(a, b));
    }
}
