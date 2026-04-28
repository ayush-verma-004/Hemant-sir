package ques9;

import java.util.HashMap;
import java.util.Map;

public class Ques9 {
    public static void countFrequency(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String input = "hello world";
        System.out.println("Input: " + input);
        countFrequency(input);
    }
}
