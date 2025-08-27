package com.pavz.testing;

public class StringUtils {
    public static int countVowels(String s) {
        if (s == null) return 0;
        int count = 0;
        for (char ch : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) >= 0) count++;
        }
        return count;
    }
}
