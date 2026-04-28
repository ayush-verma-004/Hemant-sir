package ques21;

import java.util.HashMap;
import java.util.Map;

public class Ques21 {
    public static void printDuplicates(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        System.out.print("Duplicate characters: ");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String input = "programming";
        System.out.println("Input: " + input);
        printDuplicates(input);
    }
}
