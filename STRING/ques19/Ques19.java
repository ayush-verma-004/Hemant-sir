package ques19;

public class Ques19 {
    public static String findLargestWord(String str) {
        String[] words = str.split("\\s+");
        String largest = "";
        for (String word : words) {
            if (word.length() > largest.length()) {
                largest = word;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        System.out.println("Input: " + input);
        System.out.println("Largest Word: " + findLargestWord(input));
    }
}
