package ques7;

public class Ques7 {
    public static String removeWhitespace(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isWhitespace(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = " H e l l o   W o r l d ";
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Result: \"" + removeWhitespace(input) + "\"");
    }
}
