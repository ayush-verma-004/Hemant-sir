package ques17;

public class Ques17 {
    public static String swapCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                chars[i] = Character.toLowerCase(chars[i]);
            } else if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("Input: " + input);
        System.out.println("Swapped: " + swapCase(input));
    }
}
