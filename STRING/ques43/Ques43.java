package ques43;

import java.util.HashSet;
import java.util.Set;

public class Ques43 {
    public static String smallestSubstringWithUniqueChars(String str) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : str.toCharArray()) uniqueChars.add(c);
        int n = uniqueChars.size();
        
        int minLen = Integer.MAX_VALUE;
        String res = "";
        
        for (int i = 0; i < str.length(); i++) {
            Set<Character> currentSet = new HashSet<>();
            for (int j = i; j < str.length(); j++) {
                currentSet.add(str.charAt(j));
                if (currentSet.size() == n) {
                    if (j - i + 1 < minLen) {
                        minLen = j - i + 1;
                        res = str.substring(i, j + 1);
                    }
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String input = "aabcbcdbca";
        System.out.println("Input: " + input);
        System.out.println("Result: " + smallestSubstringWithUniqueChars(input));
    }
}
