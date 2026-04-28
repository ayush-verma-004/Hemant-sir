package ques11;

import java.util.HashSet;
import java.util.Set;

public class Ques11 {
    public static char firstRepeating(String str) {
        Set<Character> seen = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (seen.contains(ch)) {
                return ch;
            }
            seen.add(ch);
        }
        return '\0';
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Input: " + input);
        char result = firstRepeating(input);
        if (result != '\0') {
            System.out.println("First repeating character: " + result);
        } else {
            System.out.println("No repeating character found.");
        }
    }
}
