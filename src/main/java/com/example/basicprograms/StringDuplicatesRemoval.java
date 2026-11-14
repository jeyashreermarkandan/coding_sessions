package com.example.basicprograms;

import java.util.HashSet;
import java.util.Set;

public class StringDuplicatesRemoval {
    public static String removeDuplicates(String s) {
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (seen.add(character)) {
                result.append(character);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "geEksforGEeks";
        System.out.println(removeDuplicates(s));
    }
}
