package ques18;

public class Ques18 {
    public static String replaceSpaces(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                chars[i] = '-';
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "Replace spaces with hyphen";
        System.out.println("Input: " + input);
        System.out.println("Result: " + replaceSpaces(input));
    }
}
