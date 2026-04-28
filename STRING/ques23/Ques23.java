package ques23;

public class Ques23 {
    public static void countTypes(String str) {
        int upper = 0, lower = 0, digits = 0, special = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) upper++;
            else if (Character.isLowerCase(ch)) lower++;
            else if (Character.isDigit(ch)) digits++;
            else special++;
        }
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Digits: " + digits);
        System.out.println("Special: " + special);
    }

    public static void main(String[] args) {
        String input = "Hello World! 123 @#$";
        System.out.println("Input: " + input);
        countTypes(input);
    }
}
