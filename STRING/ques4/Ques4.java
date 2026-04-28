package ques4;

public class Ques4 {
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int count = 0;
        boolean isWord = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ' && str.charAt(i) != '\t' && str.charAt(i) != '\n') {
                if (!isWord) {
                    count++;
                    isWord = true;
                }
            } else {
                isWord = false;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "  Hello   World from Java  ";
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Word count: " + countWords(input));
    }
}
