package ques44;

import java.util.HashSet;
import java.util.Set;

public class Ques44 {
    public static int countDistinctSubstrings(String str) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                set.add(str.substring(i, j));
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        String input = "ababa";
        System.out.println("Input: " + input);
        System.out.println("Count: " + countDistinctSubstrings(input));
    }
}
