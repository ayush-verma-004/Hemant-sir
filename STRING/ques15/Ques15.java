package ques15;

public class Ques15 {
    public static boolean containsOnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "123456";
        System.out.println("Input: " + input);
        System.out.println("Contains only digits: " + containsOnlyDigits(input));
        
        input = "123a45";
        System.out.println("Input: " + input);
        System.out.println("Contains only digits: " + containsOnlyDigits(input));
    }
}
