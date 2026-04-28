package ques10;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ques10 {
    public static char firstNonRepeating(String str) {
        Map<Character, Integer> freqMap = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String input = "swiss";
        System.out.println("Input: " + input);
        char result = firstNonRepeating(input);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
