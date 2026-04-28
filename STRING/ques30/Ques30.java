package ques30;

import java.util.HashSet;
import java.util.Set;

public class Ques30 {
    public static int longestSubstringWithoutRepeating(String str) {
        int n = str.length();
        int res = 0;
        for (int i = 0; i < n; i++) {
            Set<Character> visited = new HashSet<>();
            for (int j = i; j < n; j++) {
                if (visited.contains(str.charAt(j))) {
                    break;
                } else {
                    res = Math.max(res, j - i + 1);
                    visited.add(str.charAt(j));
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Input: " + input);
        System.out.println("Length: " + longestSubstringWithoutRepeating(input));
    }
}
