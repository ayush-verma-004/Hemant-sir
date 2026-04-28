package ques20;

public class Ques20 {
    public static String findSmallestWord(String str) {
        String[] words = str.split("\\s+");
        if (words.length == 0) return "";
        String smallest = words[0];
        for (String word : words) {
            if (word.length() < smallest.length() && !word.isEmpty()) {
                smallest = word;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        System.out.println("Input: " + input);
        System.out.println("Smallest Word: " + findSmallestWord(input));
    }
}
