package ques8;

public class Ques8 {
    public static String removeVowels(String str) {
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) == -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Input: " + input);
        System.out.println("Result: " + removeVowels(input));
    }
}
