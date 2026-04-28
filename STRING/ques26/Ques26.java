package ques26;

import java.util.HashMap;
import java.util.Map;

public class Ques26 {
    public static boolean canFormPalindrome(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        int oddCount = 0;
        for (int count : freqMap.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount <= 1;
    }

    public static void main(String[] args) {
        String input = "aabbc";
        System.out.println("Input: " + input);
        System.out.println("Can form palindrome: " + canFormPalindrome(input));
    }
}
