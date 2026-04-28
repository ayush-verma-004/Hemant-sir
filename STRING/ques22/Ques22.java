package ques22;

public class Ques22 {
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            StringBuilder rev = new StringBuilder(word);
            result.append(rev.reverse().toString()).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "Hello World Java";
        System.out.println("Input: " + input);
        System.out.println("Result: " + reverseWords(input));
    }
}
