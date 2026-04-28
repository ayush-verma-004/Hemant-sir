package ques5;

public class Ques5 {
    public static String toUpperCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32);
            }
        }
        return new String(chars);
    }

    public static String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "Hello World! 123";
        System.out.println("Input: " + input);
        System.out.println("Uppercase: " + toUpperCase(input));
        System.out.println("Lowercase: " + toLowerCase(input));
    }
}
