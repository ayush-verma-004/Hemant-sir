package ques25;

import java.util.HashSet;
import java.util.Set;

public class Ques25 {
    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        Set<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }
        return set.size() == 26;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        System.out.println("Input: " + input);
        System.out.println("Is Pangram: " + isPangram(input));
    }
}
