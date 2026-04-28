package ques14;

import java.util.LinkedHashSet;
import java.util.Set;

public class Ques14 {
    public static String removeDuplicates(String str) {
        Set<Character> set = new LinkedHashSet<>();
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : set) {
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        System.out.println("Input: " + input);
        System.out.println("Result: " + removeDuplicates(input));
    }
}
